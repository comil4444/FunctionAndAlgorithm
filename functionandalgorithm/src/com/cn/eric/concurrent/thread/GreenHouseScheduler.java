package com.cn.eric.concurrent.thread;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class GreenHouseScheduler {
	
	private String dayTime = "day";
	private boolean light = true;
	private boolean water = true;
	private ScheduledExecutorService ses = Executors.newScheduledThreadPool(10);

	public void schedule(Runnable command,long initialDelay,TimeUnit unit){
		ses.schedule(command, initialDelay, unit);
	}
	
	public void scheduleAtFixedRate(Runnable command,long initialDelay,long period, TimeUnit unit){
		ses.scheduleAtFixedRate(command, initialDelay, period, unit);
	}
	
	class LightOn implements Runnable{
		@Override
		public void run() {
			light = true;
			System.out.println("light is on now!");
		}
	}
	class LightOff implements Runnable{
		@Override
		public void run() {
			light = false;
			System.out.println("light is off now!");
		}
	}
	
	class WaterOn implements Runnable{
		@Override
		public void run() {
			water = true;
			System.out.println("water is on now!");
		}
	}
	class WaterOff implements Runnable{
		@Override
		public void run() {
			water = false;
			System.out.println("water is off now!");
		}
	}
	
	class DaySettingOn implements Runnable{
		@Override
		public void run() {
			dayTime = "day";
			System.out.println("is "+dayTime+" now!");
		}
	}
	class DaySettingOff implements Runnable{
		@Override
		public void run() {
			dayTime = "night";
			System.out.println("is "+ dayTime +" now!");
		}
	}
	
	class Belling implements Runnable{

		@Override
		public void run() {
			System.out.println("belling!!!!!!!");
		}
	}
	
	class Terminate implements Runnable{

		@Override
		public void run() {
			try{
				System.out.println("teminating now!");
				ses.shutdownNow();
				new Thread(){
					public void run(){
						for(DataPoint d:data){
							System.out.println(d);
						}
					}
				}.start();
			}catch(Exception e){
				
			}
		}
		
	}
	
	static class DataPoint{
		final Calendar time;
		final float temprature;
		final float humidity;
		public DataPoint(Calendar d,float temp,float hum){
			this.temprature = temp;
			this.time = d;
			this.humidity = hum;
		}
		
		public String toString(){
			return "time:" + time.getTime() +";temprature:"+temprature+";humidity:"+humidity;
		}
	}
	
	private Calendar lastTime = Calendar.getInstance();
	
	{
		lastTime.set(Calendar.MINUTE, 30);
		lastTime.set(Calendar.SECOND, 00);
	}
	
	private float lastTemp = 65.0f;
	private float lastHum = 50.0f;
	private Random rand = new Random(47);
	List<DataPoint> data = Collections.synchronizedList(new ArrayList<DataPoint>());
	
	class CollectionData implements Runnable{

		@Override
		public void run() {
			System.out.println("collecting data!");
			synchronized(GreenHouseScheduler.this){
				lastTime.set(Calendar.MINUTE, lastTime.get(Calendar.MINUTE)+30);
				lastTemp = lastTemp+rand.nextFloat();
				lastHum = lastHum+rand.nextFloat();
				data.add(new DataPoint((Calendar)lastTime.clone(),lastTemp,lastHum));
			}
		}
	}
	
	public static void main(String[] args) {
		GreenHouseScheduler gh = new GreenHouseScheduler();
		gh.schedule(gh.new Terminate(), 5000, TimeUnit.MILLISECONDS);
		gh.scheduleAtFixedRate(gh.new LightOn(), 0, 200, TimeUnit.MILLISECONDS);
		gh.scheduleAtFixedRate(gh.new LightOff(), 0, 400, TimeUnit.MILLISECONDS);
		gh.scheduleAtFixedRate(gh.new WaterOn(), 0, 600, TimeUnit.MILLISECONDS);
		gh.scheduleAtFixedRate(gh.new WaterOff(), 0, 800, TimeUnit.MILLISECONDS);
		gh.scheduleAtFixedRate(gh.new DaySettingOn(), 0, 1400, TimeUnit.MILLISECONDS);
		gh.scheduleAtFixedRate(gh.new DaySettingOff(), 0, 2000, TimeUnit.MILLISECONDS);
		gh.scheduleAtFixedRate(gh.new CollectionData(), 500, 500, TimeUnit.MILLISECONDS);
	}

}
