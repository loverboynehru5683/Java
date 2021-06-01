package com.vm.training.java.Test;

public class TestSavingsAccount {

	public static void main(String[] args) {

		SavingsAccount savingsaccount = new SavingsAccount(1000,8.2);
		System.out.println("Initial Balance: Rs.1000.0");
		savingsaccount.withdraw(300);
		System.out.println("After withdrawing Rs.300, Balance is: Rs."+savingsaccount.getBalance());
		savingsaccount.deposit(500);
		System.out.println("After depositing Rs.500, Balance is: Rs."+savingsaccount.getBalance());
		savingsaccount.addInterest();
		System.out.println("Interest: "+savingsaccount.getBalance());

	}

}
