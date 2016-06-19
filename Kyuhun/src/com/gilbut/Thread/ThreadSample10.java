package com.gilbut.Thread;

public class ThreadSample10 implements Runnable{
	public static void main(String[] args) {
		Thread th = new Thread(new ThreadSample10());
		th.setPriority(3);
		th.start();
		
		try {
			Thread.sleep(500);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		th.setPriority(10);
	}

	@Override
	public void run() {
		while(true){
			System.out.println("Priority :" + Thread.currentThread().getPriority());
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
