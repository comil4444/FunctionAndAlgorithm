package com.cn.eric.concurrent.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLock {

	public static void main(String[] args) {
		final Test1 t1 = new Test1();
		new Thread(new Runnable(){

			@Override
			public void run() {
				t1.methond();
			}
		}).start();
		
		new Thread(new Runnable(){

			@Override
			public void run() {
				t1.methond2();
			}
		}).start();
		
		new Thread(new Runnable(){

			@Override
			public void run() {
				t1.methodPrivateLock();
			}
		}).start();
		
		new Thread(new Runnable(){

			@Override
			public void run() {
				t1.methodSyn();
			}
		}).start();
		
		new Thread(new Runnable(){

			@Override
			public void run() {
				t1.methodSynLock();
			}
		}).start();
	}
	

}

class Test1{
	int i = 0;
	static int j = 0;
	Lock lock = new ReentrantLock();
	
	public void methond(){
		lock.lock();
		try{
			System.out.println("method");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
	public void methodPrivateLock(){
		Lock l = new ReentrantLock();
		l.lock();
		try{
			System.out.println("methondPrivateLock");
		}finally{
			l.unlock();
		}
	}
	
	
	public void methond2(){
		lock.lock();
		lock.lock();
		try{
			System.out.println("method2");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
	public synchronized void methodSyn(){
		try{
			System.out.println("methondSyn");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void methodSynLock(){
		synchronized(lock){
			
			try{
				System.out.println("methondSynLock");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
