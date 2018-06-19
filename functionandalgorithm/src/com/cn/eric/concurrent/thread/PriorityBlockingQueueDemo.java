package com.cn.eric.concurrent.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

public class PriorityBlockingQueueDemo {

	public static void main(String[] args) {
		Random rand = new Random(47);
		ExecutorService es = Executors.newCachedThreadPool();
		PriorityBlockingQueue<Runnable> queue = new PriorityBlockingQueue<Runnable>();
		
		es.execute(new PrioritizedTaskProducer(es,queue));
		es.execute(new PrioritizedConsumer(queue));
	}

}

class PrioritizedTask implements Runnable,Comparable<PrioritizedTask>{
	
	private Random rand = new Random(47);
	private static int counter = 0;
	private final int id = counter++;
	private final int priority;
	protected static List<PrioritizedTask> sequence = new ArrayList<PrioritizedTask>();
	public PrioritizedTask(int priority){
		this.priority = priority;
		sequence.add(this);
	}
	
	@Override
	public int compareTo(PrioritizedTask o) {
		return this.priority<o.priority?1:(this.priority>o.priority?-1:0);
	}
	@Override
	public void run() {
		try{
			TimeUnit.MILLISECONDS.sleep(rand.nextInt(250));
		}catch(Exception e){
			
		}finally{
			System.out.println(this);
		}
	}
	
	public String toString(){
		return String.format("[%1$-3d]",this.priority)+" Task:"+this.id;
	}
	
	public String summary(){
		return "(" + id + ":" + this.priority + ")";
	}
	
	public static class EndSentinel extends PrioritizedTask{
		private ExecutorService es;
		public EndSentinel(ExecutorService es){
			super(-1);
			this.es = es;
		}
		
		public void run(){
			int count = 0;
			for(PrioritizedTask task:sequence){
				System.out.println(task.summary());
				if(++count%5==0)
					System.out.println();
			}
			System.out.println();
			System.out.println(this + " calling shutdown");
			es.shutdownNow();
		}
	}
}

class PrioritizedTaskProducer implements Runnable{
	
	private Random rand = new Random(47);
	private Queue<Runnable> queue;
	private ExecutorService exec;
	public PrioritizedTaskProducer(ExecutorService es,Queue<Runnable> q){
		this.exec = es;
		this.queue = q;
	}
	
	public void run(){
		for(int i=0;i<20;i++){
			queue.add(new PrioritizedTask(10));
			Thread.yield();
		}
		try{
			for(int i=0;i<10;i++){
				TimeUnit.MILLISECONDS.sleep(250);
				queue.add(new PrioritizedTask(i));
			}
			for(int i=0;i<10;i++){
				queue.add(new PrioritizedTask(i));
			}
			queue.add(new PrioritizedTask.EndSentinel(exec));
		}catch(Exception e){
			
		}
		System.out.println("Finished PrioritizedTaskProducer");
	}
}

class PrioritizedConsumer implements Runnable{
	private PriorityBlockingQueue<Runnable> q;
	
	public PrioritizedConsumer(PriorityBlockingQueue<Runnable> q){
		this.q = q;
	}
	
	@Override
	public void run() {
		try{
			while(!Thread.interrupted()){
				q.take().run();
			}
		}catch(Exception e){
			
		}
		System.out.println("Finished PrioritizedConsumer");
	}
	
}
