package com.gilbut.Thread;

public class ThreadSample2 extends Thread{
	public static void main(String[] args) {
		ThreadSample2 sample2 = new ThreadSample2();
		sample2.run();

	}
	

	public void run()
	{
		System.out.println("New flow, new thread is runnign");
	}


}
