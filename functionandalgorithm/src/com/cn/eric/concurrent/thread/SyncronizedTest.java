package com.cn.eric.concurrent.thread;

public class SyncronizedTest {
	public static void main(String[] args){
		for(int i=0;i<10000;i++){
			Thread t = new EnergyThread();
			t.start();
		}
	}
}

class EngrySystem{
	
	public final double[] energyBox = new double[10];
	private Object lock = new Object();
	
	public EngrySystem(double avg){
		for(int i=0;i<energyBox.length;i++)
			energyBox[i]=avg;
	}
	
	public void transfer(int from,int to,double energy){
		
		synchronized(lock){
			while(energy>energyBox[from])
				try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				};
			System.out.println("能量盒子"+from+"正在向能量盒子"+to+"输送能量"+energy+",总能量："+sum());
			energyBox[from] = energyBox[from]-energy;
			energyBox[to] = energyBox[to]+energy;
			System.out.println("能量盒子"+to+"正在吸收能量盒子"+from+"输送来的能量"+energy+",总能量："+sum());
			lock.notifyAll();
		}
	}
	
	public double sum(){
		double sum = 0;
		for(int i=0;i<energyBox.length;i++)
			sum+=energyBox[i];
		return sum;
	}
}

class EnergyThread extends Thread{

	EngrySystem es = new EngrySystem(10);
	@Override
	public void run() {
		while(true){
			es.transfer((int)(Math.random()*10), (int)(Math.random()*10), (int)(Math.random()*10));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
