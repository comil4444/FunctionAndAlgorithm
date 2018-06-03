package com.cn.eric.basic.syntax.thread;

import java.io.IOException;

public class DaemonDemo implements Runnable{
	
	private static double d=1.0d;
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new DaemonDemo());
		t1.setDaemon(true);
		t1.start();
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(d);
	}

	@Override
	public void run() {
		while(true)
			d+=1;
	}

}
