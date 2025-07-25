package com.bankapplication;

public class AtmInterface {
	private String accountHolder;
	private int accountNumber;
	private double balance;
	public String getBalance;
	public AtmInterface(String accountHolder , int accountNumber , double balance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance ;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount) {
		if(amount <= 0) {
			System.out.println("Invalid Ammount");
		}else {
			this.balance += amount;
			System.out.println("Depposit sucessfull");
		}
	}
	public void withdraw(double amount) {
		if(this.balance >= amount) {
			this.balance -= amount;
			System.out.println("Withdraw Sucessfull");
		}else {
			System.out.println("Insufficent Balance");
		}
	}
	
}
