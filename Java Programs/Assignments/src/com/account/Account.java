package com.account;

public class Account {
	public int acctId;
	public String acctType;
	public int acctBalance;
	public Account(int acctId,String acctType,int acctBalance){
		this.acctId=acctId;
		this.acctType=acctType;
		this.acctBalance=acctBalance;
	}
	public void deposit(int amount) {
		acctBalance=acctBalance + amount;
	}
	public void withdraw(int amount) {
		if(amount>acctBalance)
			System.out.println("Insufficient Amount");
		else
			acctBalance=acctBalance - amount;
	}
	public int getBalance() {
		return acctBalance;
	}
	public void display() {
		System.out.println("Account ID : "+acctId);
		System.out.println("Account Type : "+acctType);
		System.out.println("Account Balance : "+acctBalance);
	}
}
