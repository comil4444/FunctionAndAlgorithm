package com.cn.eric.concurrent.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Pool<T> {

	private int size;
	private List<T> items = new ArrayList<T>();
	
	private volatile boolean[] checkedOut;
	private Semaphore available;
	
	public Pool(Class<T> classObject,int size){
		this.size = size;
		for(int i=0;i<size;i++){
			try {
				items.add(classObject.newInstance());
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public T checkOut() throws InterruptedException{
		available.acquire();
		return getItem();
	}
	
	private synchronized T getItem() {
		for(int i=0;i<this.size;i++){
			if(!checkedOut[i]){
				checkedOut[i] = true;
				return items.get(i);
			}
		}
		return null;
	}
	
	public void checkIn(T t){
		if(releaseItem(t))
			available.release();
		
	}

	private synchronized boolean releaseItem(T t) {
		int index = items.indexOf(t);
		if(index==-1) return false;
		if(checkedOut[index]){
			checkedOut[index]=false;
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

