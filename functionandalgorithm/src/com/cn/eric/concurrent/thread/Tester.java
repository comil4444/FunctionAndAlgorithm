package com.cn.eric.concurrent.thread;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import static java.lang.System.*;

public abstract class Tester<C> {

	static int testReps = 10;
	static int testCycles = 10000;
	static int containerSize = 10000;
	abstract C containerInit();
	abstract void startReadrsAndWriters();
	C testContainer;
	String testId;
	int nReaders;
	int nWriters;
	volatile long readResult = 0;
	volatile long readTime = 0;
	volatile long writeTime = 0;
	CountDownLatch endLatch;
	static ExecutorService es = Executors.newCachedThreadPool();
	Integer[] writeData;
	Tester(String testId,int nReaders,int nWriters){
		this.testId=testId;
		this.nReaders=nReaders;
		this.nWriters=nWriters;
		Random rand = new Random(47);
		writeData = new Integer[containerSize];
		for(int i=0;i<containerSize;i++){
			writeData[i]=rand.nextInt(100);
		}
		for(int i=0;i<testReps;i++){
			runTest();
			readTime=0;
			writeTime=0;
		}
	}
	private void runTest() {
		endLatch = new CountDownLatch(nReaders + nWriters);
		testContainer = containerInit();
		startReadrsAndWriters();
		try{
			endLatch.await();
		}catch(Exception e){
			
		}
		out.println(String.format("%-27s %14d %14d",testId,readTime,writeTime));
	}
	
	abstract class TestTask implements Runnable{
		abstract void test();
		abstract void putResults();
		long duration;
		@Override
		public void run(){
			long startTime = nanoTime();
			test();
			duration = nanoTime()-startTime;
			synchronized(Tester.this){
				putResults();
			}
			endLatch.countDown();
		}
	}
	
	public static void initMain(int testReps,int testCycles,int containerSize){
		Tester.testReps = testReps;
		Tester.testCycles=testCycles;
		Tester.containerSize=containerSize;
	}
	
}
