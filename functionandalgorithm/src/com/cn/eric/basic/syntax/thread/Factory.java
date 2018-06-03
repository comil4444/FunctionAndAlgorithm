package com.cn.eric.basic.syntax.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Factory {

	ExecutorService es = Executors.newCachedThreadPool();
	Lock lock = new ReentrantLock();
	Condition condition = lock.newCondition();
	Product pro = null;
	Worker worker = new Worker(this);
	Consumer consumer = new Consumer(this);

	public static void main(String[] args) {
		
		Factory f = new Factory();
		f.es.execute(f.worker);
		f.es.execute(f.consumer);

	}
}

class Worker implements Runnable {

	private Factory factory = null;

	Worker(Factory factory) {
		this.factory = factory;
	}

	@Override
	public void run() {
		while(!Thread.interrupted()){
			factory.lock.lock();
			try {
				while(factory.pro!=null){
					factory.condition.await();
				}
				System.out.println("生產！");
				factory.pro = new Product();
				factory.condition.signal();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally{
				factory.lock.unlock();
			}
		}
	}

}

class Consumer implements Runnable {

	private Factory factory = null;

	Consumer(Factory factory) {
		this.factory = factory;
	}

	@Override
	public void run() {
		while(!Thread.interrupted()){
			factory.lock.lock();
			try {
				while(factory.pro==null){
					factory.condition.await();
				}
				System.out.println("消費！");
				factory.pro = null;
				factory.condition.signal();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally{
				factory.lock.unlock();
			}
		}
	}
}

class Product{
	
}