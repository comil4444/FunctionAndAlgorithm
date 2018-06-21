package com.cn.eric.concurrent.thread;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.System.*;

public class PerformanceTest {

	public static void main(String[] args) throws Throwable, Throwable {
		AtomicAccumulator atomic = new AtomicAccumulator();
		LockAccumulator lockAcc = new LockAccumulator();
		SynchronizedAccumulator synAcc = new SynchronizedAccumulator();
		BaseLine base = new BaseLine();
		ExecutorService es = Executors.newCachedThreadPool();
		for(int i=0;i<10;i++){
			Accumulator.cycle*=2;
			out.println("=====================");
			atomic.timedTest(es);
			lockAcc.timedTest(es);
			synAcc.timedTest(es);
			base.timedTest(es);
		}
		es.shutdown();
	}
}

class AtomicAccumulator extends Accumulator{
	{id = "atomic";}
	private AtomicInteger index = new AtomicInteger(0);
	private AtomicLong value = new AtomicLong(0);
	
	@Override
	void modify() {
		int i = index.getAndIncrement();
		value.getAndAdd(preLoad[i%SIZE]);
		if(++i>=SIZE)
			index.set(0);
	}

	@Override
	long read() {
		return value.get();
	}
	
}

class LockAccumulator extends Accumulator{
	{id = "lock";}
	private ReentrantLock lock=new ReentrantLock();
	@Override
	long read() {
		lock.lock();
		try{
			return value;
		}finally{
			lock.unlock();
		}
	}

	@Override
	synchronized void modify() {
		lock.lock();
		try{
			if(index>=SIZE) index=0;
			value +=preLoad[index++];
		}finally{
			lock.unlock();
		}
	}
}

class SynchronizedAccumulator extends Accumulator{
	{id = "synchronized";}
	@Override
	synchronized long read() {
		return value;
	}

	@Override
	synchronized void modify() {
		if(index>=SIZE) index=0;
		value +=preLoad[index++];
	}
}

class BaseLine extends Accumulator{
	{id = "baseline";}
	@Override
	long read() {
		return value;
	}

	@Override
	void modify() {
		if(index>=SIZE) index=0;
		value +=preLoad[index++%SIZE];
	}
}

abstract class Accumulator{
	protected String id;
	protected static int cycle = 50000;
	protected final static int SIZE = 100000;
	private static Random rand = new Random(47);
	private final static int TYPE=4;
	private CyclicBarrier cyclicBarrier = new CyclicBarrier(TYPE*2+1);
	
	protected static int[] preLoad = new int[SIZE];
	
	protected volatile int index=0;
	protected volatile long value=0;
	
	static{
		for(int i=0;i<SIZE;i++)
			preLoad[i]=rand.nextInt(100);
	}
	
	abstract long read();
	abstract void modify();
	
	private class Reader implements Runnable{

		@Override
		public void run() {
			for(int i=0;i<cycle;i++){
				read();
			}
			try {
				cyclicBarrier.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private class Modifier implements Runnable{

		@Override
		public void run() {
			for(int i=0;i<cycle;i++)
				modify();
			try {
				cyclicBarrier.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void timedTest(ExecutorService es) throws InterruptedException, BrokenBarrierException{
		long start = System.nanoTime();
		for(int i=0;i<TYPE;i++){
			es.execute(new Reader());
			es.execute(new Modifier());
		}
		cyclicBarrier.await();
		System.out.print(String.format("%-13s::%13d\n", id,(System.nanoTime()-start)));
	}
}
