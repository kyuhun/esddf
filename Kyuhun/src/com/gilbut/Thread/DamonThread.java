package com.gilbut.Thread;

public class DamonThread implements Runnable{
	public static void main(String[] args) {
		Thread th = new Thread(new DamonThread());
		th.setDaemon(true);
		th.start();
		
		try {
			
			 Thread.sleep(1000);
		} catch (Exception e) {
			 e.printStackTrace();
		}
	
		System.out.println("Main thread terminated...");
	}

	@Override
	public void run() {
		while(true){
			
			System.out.println("is running...");
			
			try {
				Thread.sleep(500);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
	}
}
