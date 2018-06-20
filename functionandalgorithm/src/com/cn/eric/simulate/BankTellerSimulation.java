package com.cn.eric.simulate;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BankTellerSimulation {
	static final int SIZE = 50;
	static final int adjustTime = 1000;
	
	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool();
		CustomerLine customerLine = new CustomerLine(SIZE);
		es.execute(new CustomerGenerator(customerLine));
		es.execute(new TellerManager(es,customerLine,adjustTime));
		
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		es.shutdownNow();
	}
}

class TellerManager implements Runnable{
	private ExecutorService es;
	private CustomerLine customerLine;
	private int adjustTime;
	private PriorityQueue<Teller> workingTellers = new PriorityQueue<Teller>();
	private Queue<Teller> doElseTellers = new LinkedList<Teller>();
	
	TellerManager(ExecutorService es,CustomerLine customerLine, int adjustTime){
		this.es = es;
		this.customerLine = customerLine;
		this.adjustTime = adjustTime;
		
		Teller teller = new Teller(this.customerLine);
		es.execute(teller);
		workingTellers.add(teller);
	}

	public void adjustTellerNumber(){
		if(customerLine.size()/workingTellers.size()>2){
			if(doElseTellers.size()>0){
				Teller teller = doElseTellers.remove();
				teller.serverCustomer();
				workingTellers.offer(teller);
				return;
			}
			Teller teller = new Teller(this.customerLine);
			workingTellers.offer(teller);
			es.execute(teller);
			return;
		}
		if(workingTellers.size()>1&&customerLine.size()/workingTellers.size()<2)
			reassignOneTeller();
		if(customerLine.size()==0)
			while(workingTellers.size()>1)
				reassignOneTeller();
	}
	
	private void reassignOneTeller() {
		Teller teller = workingTellers.poll();
		teller.doSomethingElse();
		doElseTellers.offer(teller);
	}

	@Override
	public void run() {
		try{
			while(!Thread.interrupted()){
				TimeUnit.MILLISECONDS.sleep(adjustTime);
				adjustTellerNumber();
				System.out.print(customerLine+"{");
				for(Teller teller:workingTellers){
					System.out.print(teller+" ");
				}
				System.out.println("}");
			}
		}catch(Exception e){
			
		}
	}
	
}

class Teller implements Runnable,Comparable<Teller>{
	
	private static int counter = 0;
	private final int id = ++counter;
	
	private int customerServed = 0;
	private CustomerLine customerLine;
	private boolean isServing=true;
	
	Teller(CustomerLine customerLine){
		this.customerLine = customerLine;
	}
	
	public void setCustomerLine(CustomerLine line){
		this.customerLine = line;
	}

	public synchronized void doSomethingElse(){
		this.isServing=false;
		this.customerServed=0;
	}
	
	public synchronized void serverCustomer(){
		this.isServing=true;
		notifyAll();
	}
	
	@Override
	public int compareTo(Teller o) {
		return this.customerServed<o.customerServed?-1:(this.customerServed>o.customerServed?1:0);
	}
	
	@Override
	public void run() {
		try{
			while(!Thread.interrupted()){
				Customer customer = customerLine.take();
				Thread.sleep(customer.getServiceTime());
				synchronized(this){
					customerServed++;
					while(!isServing)
						wait();
				}
			}
		}catch(Exception e){
			
		}
	}
	
	public String toString(){
		return "Teller id:"+this.id;
	}
	
}

class CustomerGenerator implements Runnable{

	private CustomerLine customerLine;
	private static Random random = new Random(47);
	private static int id=0;
	
	CustomerGenerator(CustomerLine line){
		this.customerLine = line;
	}
	
	@Override
	public void run() {
		try{
			while(!Thread.interrupted()){
				TimeUnit.MILLISECONDS.sleep(random.nextInt(300));
				customerLine.put(new Customer(id++,random.nextInt(1000)));
			}
		}catch(Exception e){
			
		}
	}
	
}

class CustomerLine extends ArrayBlockingQueue<Customer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomerLine(int capacity) {
		super(capacity);
	}
	
	public String toString(){
		if(this.size()==0)
			return "empty";
		StringBuilder sb = new StringBuilder();
		for(Customer customer:this){
			sb.append(customer);
		}
		return sb.toString();
	}
	
}

class Customer{
	private final int id;
	private final int serviceTime;
	
	Customer(int id,int serviceTime){
		this.id=id;
		this.serviceTime = serviceTime;
	}
	public int getId() {
		return id;
	}
	public int getServiceTime() {
		return serviceTime;
	}
	public String toString(){
		return "["+this.id+":"+this.serviceTime+"]";
	}
}
