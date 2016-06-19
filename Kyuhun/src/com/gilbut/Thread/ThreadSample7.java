package com.gilbut.Thread;

public class ThreadSample7 {
	public static void main(String[] args) {
		String thisThName = Thread.currentThread().getName();
		System.out.println("Thread name : " + thisThName);
		String thisGrpName = Thread.currentThread().getThreadGroup().getName();
		System.out.println("ThreadGroup name : "+thisGrpName);
	}
}
