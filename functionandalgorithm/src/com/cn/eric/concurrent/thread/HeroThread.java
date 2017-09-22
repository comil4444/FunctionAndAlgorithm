package com.cn.eric.concurrent.thread;

public class HeroThread extends Thread {
	
	public HeroThread(String name){
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+"正在大肆屠杀对方！！！");
		}
		System.out.println(Thread.currentThread().getName()+"进攻结束！");
	}

}
