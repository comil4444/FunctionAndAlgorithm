package com.cn.eric.concurrent.thread;

public class ArmRunnable implements Runnable {

	volatile boolean keepDoing=true;
	
	@Override
	public void run() {
		while(keepDoing){
			for(int i=0;i<5;i++){
				System.out.println(Thread.currentThread().getName()+"正在发起第["+i+"]波进攻！");
				Thread.yield();
			}
		}
		System.out.println(Thread.currentThread().getName()+"结束了进攻！");
	}

}
