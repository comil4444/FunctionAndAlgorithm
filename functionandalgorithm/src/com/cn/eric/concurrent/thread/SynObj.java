package com.cn.eric.concurrent.thread;
/*
 * synchronized 关键字：
 * 可以锁对象，可以锁类
 * 
 * 1.锁对象(包含函数以及代码块)	
 * 
 * 	任何拿到了该对象的锁才用有执行的权限，而且对应对象的所有同步风发均会被阻塞
 * 
 * 2.锁类 
 * 
 * 	.class或者静态方法均会被锁定
 */
public class SynObj {
    public synchronized void methodA() {
        System.out.println("methodA.....");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public  void methodB() {
        synchronized(this) {
            System.out.println("methodB.....");
        }
    }

    public void methodC() {
        String str = "sss";
        synchronized (str) {
            System.out.println("methodC.....");
        }
    }
    public synchronized static void methodStatic(){
    	System.out.println("methodStatic.....");
    	 try {
             Thread.sleep(5000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
    }
    public synchronized static void methodStatic2(){
    	System.out.println("methodStatic2.....");
    	 try {
             Thread.sleep(5000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
    }
    
    public void methodClass(){
    	synchronized(SynObj.class){
    		System.out.println("method Class....");
    		try {
    			Thread.sleep(5000);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
    	}
    }
    
    public void methodClass2(){
    	synchronized(SynObj.class){
    		System.out.println("method Class2....");
    		try {
    			Thread.sleep(5000);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
    	}
    }
    
    public void method(){
    	System.out.println("method without synchronized");
    }
}