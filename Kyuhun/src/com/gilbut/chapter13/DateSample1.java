package com.gilbut.chapter13;

import java.util.Date;

public class DateSample1 {
	public static void main(String[] args) {
		Date nowDate = new Date();
		Date preDate = new Date();
		
		preDate.setTime(nowDate.getTime()- 60 * 60 * 1000);
	
		Date zeroDate = new Date();
		zeroDate.setTime(0);
		System.out.println("nowDate object : " + nowDate.toString());
		System.out.println("preDate object : " + preDate.toString());
		System.out.println("zeroDate object : " + zeroDate.toString());
	
		System.out.println("nowDate is after preDate:" + nowDate.after(preDate));
		System.out.println("nowDate is before preDate:" + nowDate.before(preDate));
		System.out.println("compareTo result:" + nowDate.compareTo(preDate));
	
	}
}
