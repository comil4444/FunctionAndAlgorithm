package com.cn.eric.basic.syntax.thread;

public class SychronizedDemo implements Runnable{
	
	private int i=0;
	
	public synchronized void add(){
		i++;
		i++;
	}
	
	public int get(){
		return i;
	}

	public static void main(String[] args) {
		SychronizedDemo sd = new SychronizedDemo();
		Thread t1 = new  Thread(sd);
		t1.start();
		while(true){
			int val = sd.get();
			if(val%2!=0){
				System.out.println(val+":"+sd.get());
				System.exit(1);
			}
		}
	}

	@Override
	public void run() {
		while(true)
			add();
	}

}
