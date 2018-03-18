package com.cn.eric.concurrent.thread;

public class TestSyn {
    public static void main(String[] args) {
        final SynObj obj = new SynObj();
        
        Thread t1 = new Thread(new Runnable() {
        	public void run() {
        		obj.methodA();
        	}
        });
        t1.start();
        
        final SynObj obj1 = new SynObj();
        
        Thread t2 = new Thread(new Runnable() {
        	public void run() {
        		obj1.methodA();
        	}
        });
        t2.start();
    }
}