package org.example.question1;

public class SavingsAccount extends BankAccount {
	private double withdrawLimit=10000;
	public SavingsAccount(String accNum, double balance) {
        super(accNum, balance);
    }
	
	public void withdraw(double amount) {
		double balance=super.getBalance();
		if(amount>=withdrawLimit) {
			 System.out.println("Invalid withdrawl amount.");
		}
		else {
		super.withdraw(amount);
		}
	}
}
