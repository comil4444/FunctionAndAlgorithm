package com.cn.eric.simulate;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class CarBuilder {
	
	public static void main(String[] args) throws InterruptedException {

		ExecutorService es = Executors.newCachedThreadPool();
		CarQueue rawQueue = new CarQueue();
		CarQueue finishQueue = new CarQueue();
		RobertPool pool = new RobertPool();
		es.execute(new Assembler(rawQueue,finishQueue,pool));
		es.execute(new EngineRober(pool));
		es.execute(new WheelRober(pool));
		es.execute(new DriveTrainRober(pool));
		es.execute(new RawCarBuilder(rawQueue));
		TimeUnit.MILLISECONDS.sleep(10000);
		es.shutdownNow();
	}
}

class Assembler implements Runnable{
	
	private RobertPool pool;
	private Car car;
	
	public Car getCar(){
		return car;
	}
	
	private CarQueue rawQueue,fnishQueue;
	CyclicBarrier cyclicBarrier = new CyclicBarrier(4);
	
	public Assembler(CarQueue rawQueue, CarQueue fnishQueue,RobertPool pool) {
		super();
		this.rawQueue = rawQueue;
		this.fnishQueue = fnishQueue;
		this.pool = pool;
	}
	
	@Override
	public void run() {
		while(!Thread.interrupted()){
			Car car;
			try {
				car = rawQueue.take();
				this.car = car;
				pool.hire(EngineRober.class, this);
				pool.hire(DriveTrainRober.class, this);
				pool.hire(WheelRober.class, this);
				cyclicBarrier.await();
				System.out.println(car.getId()+" has finish!");
				fnishQueue.put(car);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class RobertPool{
	
	private List<Robert> roberts = new ArrayList<Robert>();
	
	public synchronized void add(Robert robert){
		roberts.add(robert);
		notifyAll();
	}
	
	public synchronized void hire(Class<? extends Robert> robertType,Assembler d) throws InterruptedException{
		for(Robert robert:roberts){
			if(robert.getClass().equals(robertType)){
				roberts.remove(robert);
				robert.assignAssembler(d);
				robert.engage();
				return;
			}
		}
		wait();
		hire(robertType,d);//配合Add方法的notifyAll使用
	}
	
	public synchronized void release(Robert r){
		add(r);
	}
}

class EngineRober extends Robert{
	
	EngineRober(RobertPool pool){
		super(pool);
	}
	@Override
	void performService() {
		this.assembler.getCar().addEngine();
		System.out.println("car  has added Engine!");
	}
}

class WheelRober extends Robert{
	
	WheelRober(RobertPool pool){
		super(pool);
	}
	@Override
	void performService() {
		this.assembler.getCar().addEngine();
		System.out.println("car  has added Wheels!");
	}
}

class DriveTrainRober extends Robert{
	
	DriveTrainRober(RobertPool pool){
		super(pool);
	}
	@Override
	void performService() {
		this.assembler.getCar().addDrivenTrain();;
		System.out.println("car  has added driveTrain!");
	}
}

abstract class Robert implements Runnable{
	private RobertPool pool;
	Robert(RobertPool pool){
		this.pool = pool;
	}
	protected Assembler assembler;
	protected boolean isWorking=false;
	abstract void performService();
	public void assignAssembler(Assembler d) {
		this.assembler = d;
	}
	public synchronized void engage() {
		isWorking = true;
		notifyAll();
	}
	
	private synchronized void shutDown() throws InterruptedException{
		isWorking = false;
		this.assembler = null;
		pool.release(this);
		while(isWorking==false)
			wait();
	}
	
	public String toString(){ return this.getClass().getName();}
	
	public void run(){
		try{
			shutDown();
			while(!Thread.interrupted()){
				performService();
				assembler.cyclicBarrier.await();
				shutDown();
			}
		}catch(Exception e){
			
		}
	}
}

class RawCarBuilder implements Runnable{

	private CarQueue rawCarQueue;

	RawCarBuilder(CarQueue queue){
		this.rawCarQueue = queue;
	}
	
	@Override
	public void run() {
		try{
			while(!Thread.interrupted()){
				Car car = new Car();
				System.out.println("car id:"+car.getId()+" has created!");
				rawCarQueue.put(car);
				TimeUnit.MILLISECONDS.sleep(1000);
			}
		}catch(Exception e){
			
		}
	}
	
}

class CarQueue extends LinkedBlockingQueue<Car>{}

class Car{
	private static int counter=0;
	private final int id = counter++;
	
	private boolean engine = false;
	private boolean wheels = false;
	private boolean driveTrain = false;
	public int getId() {
		return id;
	}
	public synchronized void addEngine() {
		engine=true;
	}
	public synchronized void addWheels() {
		wheels=true;
	}
	public synchronized void addDrivenTrain() {
		driveTrain=true;
	}
	
	
}