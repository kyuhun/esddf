package com.gilbut.Thread;

public class ThreadSample6 {
	
	public static void main(String[] args) {
		Thread th1 = new Thread(new ChildWorker1());
		Thread th2 = new Thread(new ChildWorker2());
		th1.start();
		th2.start();
		System.out.println("main thread terminated");
	
	}
}
	class ChildWorker1 implements Runnable{

		@Override
		public void run() {
		while(true)
		{
			System.out.println("Working <<<<<<<<<");
			try {
				 Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
			
		}
		
	
	}
	class ChildWorker2 implements Runnable{
		@Override
		public void run() {
			while(true)
			{
				System.out.println("<<<<<<<<< Working");
				try {
					 Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
			}
		}
		
	}

	

