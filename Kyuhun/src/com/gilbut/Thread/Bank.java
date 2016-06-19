package com.gilbut.Thread;

public class Bank {
	private String account;
	private int money;
	public Bank(String account , int money) {
		this.account = account;
		this.money = money;
	}

	public void deposit(int money){
		this.money += money;
	}
	public boolean whitdraw(int money)
	{
		if(this.money>=money){
			this.money-=money;
			return true;
		}
		else
			return false;
		
	}
	public String getAccount(){
		return account;
	}
}
