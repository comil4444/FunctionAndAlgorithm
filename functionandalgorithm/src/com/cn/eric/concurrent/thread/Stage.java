package com.cn.eric.concurrent.thread;

public class Stage extends Thread {

	@Override
	public void run() {
		
		System.out.println("战斗开始！！！！");
		
		ArmRunnable attact = new ArmRunnable();
		ArmRunnable defence = new ArmRunnable();
		
		Thread attactArmy = new Thread(attact,"进攻方");
		Thread defenceArmy = new Thread(defence,"防守方");
	
		attactArmy.start();
		defenceArmy.start();
		
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		attact.keepDoing=false;
		defence.keepDoing=false;
		
		HeroThread hero = new HeroThread("Eric");
		hero.start();
		
		try {
			hero.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("战斗结束了！");
	}
	
	public static void main(String[] args){
		new Stage().start();
	}
	
}
