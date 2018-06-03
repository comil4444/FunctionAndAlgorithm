package com.cn.eric.basic.syntax.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Restaurant {
	
	private ExecutorService es = Executors.newCachedThreadPool();
	Meal m = null;
	Chef chef=new Chef(this);
	Waiter waiter=new Waiter(this);
	
	public static void main(String[] args) {
		Restaurant rest = new Restaurant();
		
		rest.es.execute(rest.chef);
		rest.es.execute(rest.waiter);
	}

}

class Waiter implements Runnable{

	private Restaurant rest;
	
	Waiter(Restaurant rest){
		this.rest = rest;
	}
	
	@Override
	public void run() {
		while(!Thread.interrupted()){
			synchronized(this){
				while(rest.m==null)
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			}
			System.out.println("serve the meal!");
			synchronized(rest.chef){
				rest.m=null;
				rest.chef.notify();
			}
		}
	}
}

class Chef implements Runnable{

	private Restaurant rest;
	
	Chef(Restaurant rest){
		this.rest = rest;
	}
	
	@Override
	public void run() {
		while(!Thread.interrupted()){
			synchronized(this){
				while(rest.m!=null)
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			}
			System.out.println("cook the meal!");
			synchronized(rest.waiter){
				rest.m=new Meal();
				rest.waiter.notify();
			}
		}
	}
}

class Meal{
	
}
