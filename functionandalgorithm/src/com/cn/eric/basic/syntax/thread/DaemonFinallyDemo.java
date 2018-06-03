package com.cn.eric.basic.syntax.thread;

/*
 * 
 */
public class DaemonFinallyDemo {

	public static void main(String[] args) {
		Thread t = new Thread(new DaemonThread());
		t.setDaemon(true);
		t.start();
	}

	
	static class DaemonThread implements Runnable{

		@Override
		public void run() {
			try{
				Thread.sleep(1);
			}catch(Exception e){
				
			}finally{
				System.out.println("finnaly");
			}
		}
		
	}
}
