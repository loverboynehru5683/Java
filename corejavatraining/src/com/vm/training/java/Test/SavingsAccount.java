package com.vm.training.java.Test;

public class SavingsAccount {

	private double balance;
	private double interest;

	public SavingsAccount()
	{
		balance = 0;
		interest = 0;
	}

	public SavingsAccount(double initialBalance, double initialInterest)
	{
		balance = initialBalance;
		interest = initialInterest;
	}

	public void deposit(double amount)
	{
		balance += amount;
	}

	public void withdraw(double amount)
	{
		balance -= amount;
	}

	public void addInterest()
	{
		balance =(balance + balance * interest)/100;
	}

	public double getBalance()
	{
		return balance;
	}

}
