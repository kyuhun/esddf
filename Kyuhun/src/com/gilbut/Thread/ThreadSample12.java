package com.gilbut.Thread;

public class ThreadSample12 implements Runnable
{
	public static void main(String[] args) throws InterruptedException {
			Thread th = new Thread(new ThreadSample12());
			th.start();
			Thread.sleep(50);
			th.interrupt();
	}

	@Override
	public void run() {
		while(!Thread.interrupted())
		{
			System.out.println("is running... ");
			// 직접 지연
			for(int i = 0 ; i< 1000000; i++);
		}
		System.out.println("terminated");
	}
}
