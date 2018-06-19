package com.cn.eric.concurrent.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class ToastBlockingQ {

	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool();
		ToastQueue dryQueue = new ToastQueue();
		ToastQueue butterQueue = new ToastQueue();
		ToastQueue jamQueue = new ToastQueue();
		es.execute(new Toaster(dryQueue));
		es.execute(new Butterer(dryQueue,butterQueue));
		es.execute(new Jammer(butterQueue,jamQueue));
		es.execute(new Eater(jamQueue));
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		es.shutdownNow();
	}

}

class Toast {
	private int id;

	public Toast(int id) {
		this.id = id;
	}

	public enum Status {
		DRY, BUTTERED, JAMMED
	};

	private Status status;
	
	public void dry() {
		this.status = Status.DRY;
	}

	public void butter() {
		this.status = Status.BUTTERED;
	}

	public void jam() {
		this.status = Status.JAMMED;
	}

	public Status getStatus() {
		return this.status;
	}

	public int getId() {
		return this.id;
	}

	public String toString() {
		return this.id + ":" + this.status;
	}
}

class ToastQueue<Toast> extends LinkedBlockingQueue<Toast> {
}

class Toaster implements Runnable {
	private ToastQueue<Toast> dryQueue;
	private int count;

	Toaster(ToastQueue dryQueue) {
		this.dryQueue = dryQueue;
	}

	@Override
	public void run() {
		while (!Thread.interrupted()) {
			Toast t = new Toast(++count);
			t.dry();
			System.out.println(t+" has been created!");
			dryQueue.add(t);
		}
	}
}

class Butterer implements Runnable {
	private ToastQueue<Toast> dryQueue, butteredQueue;

	Butterer(ToastQueue dryQueue, ToastQueue butteredQueue) {
		this.dryQueue = dryQueue;
		this.butteredQueue = butteredQueue;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				Toast t;
				t = dryQueue.take();
				t.butter();
				System.out.println(t+" has been buttered!");
				butteredQueue.add(t);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Jammer implements Runnable {
	private ToastQueue<Toast> jamQueue, butteredQueue;

	Jammer(ToastQueue butteredQueue,ToastQueue jamQueue) {
		this.jamQueue = jamQueue;
		this.butteredQueue = butteredQueue;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				Toast t;
				t = butteredQueue.take();
				t.jam();;
				System.out.println(t+" has been jammed!");
				jamQueue.add(t);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Eater implements Runnable {
	private ToastQueue<Toast> jamQueue;

	Eater(ToastQueue jamQueue) {
		this.jamQueue = jamQueue;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				Toast t;
				t = jamQueue.take();
				System.out.println(t+" has been eaten!");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
