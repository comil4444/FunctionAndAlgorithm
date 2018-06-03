package com.cn.eric.basic.syntax.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class RuntimeExceptionDemo {

	public static void main(String[] args) {
//		ExecutorService es = Executors.newCachedThreadPool();//can not catch exception.
//		ExecutorService es = Executors.newCachedThreadPool(new MyThreadFactory());//can catch exception
		Thread.setDefaultUncaughtExceptionHandler(new UncaughtHandler());//can catch exception
		ExecutorService es = Executors.newCachedThreadPool();
		es.execute(new ExceptionThread());
	}
}

class ExceptionThread implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread()+" is running!");
		System.out.println(Thread.currentThread().getUncaughtExceptionHandler()+"!!!");
		throw new RuntimeException();
	}
}

class MyThreadFactory implements ThreadFactory{

	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(r);
		t.setUncaughtExceptionHandler(new UncaughtHandler());
		return t;
	}
}

class UncaughtHandler implements Thread.UncaughtExceptionHandler{

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("catch:"+e);
	}
	
}
