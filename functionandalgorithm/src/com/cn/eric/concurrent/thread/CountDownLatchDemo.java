package com.cn.eric.concurrent.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchDemo {

	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(1000);
		ExecutorService es = Executors.newCachedThreadPool();
		for(int i=0;i<10;i++)
			es.execute(new Work(latch));
		for(int i=0;i<10;i++)
			es.execute(new WaitWork(latch));
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		es.shutdownNow();
	}

}

class Work implements Runnable{
	
	private CountDownLatch latch;
	
	private volatile static int count=0;
	
	Work(CountDownLatch latch){
		this.latch = latch;
	}
	@Override
	public void run() {
		
		try{
			int id = count++;
			System.out.println("begin work!"+id);
			latch.countDown();
			System.out.println("finish work!"+id);
		}catch(Exception e){
		}
	}
}

class WaitWork implements Runnable{
	
	private CountDownLatch latch;
	
	WaitWork(CountDownLatch latch){
		this.latch = latch;
	}
	@Override
	public void run() {
		
		try{
			System.out.println("!!!wait work!");
			latch.wait();
			//System.out.println(latch.getCount());
			System.out.println("!!!begin work!");
		}catch(Exception e){
		}
	}
}
