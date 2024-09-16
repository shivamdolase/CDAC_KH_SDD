package org.example.question1;

public class BankAccount {
	//deposit() and withdraw().
	private String accountNum;
	private double balance;
	
	BankAccount(){
		this(null, 0);
	}
	BankAccount(String accountNum,double balance){
		this.accountNum=accountNum;
		this.balance=balance;
		
	}
	
	public void deposite(double amount) {
		if(amount>0) {
		    this.balance+=amount;
		    System.out.println("Amount "+amount+" is deposited in your account");
		    System.out.printf("Your account balance is : %.2f",this.balance);
		}
		else {
            System.out.println("Invalid deposit amount.");
        }
	}
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
		    this.balance+=amount;
		    System.out.println("Amount "+amount+" is w your account");
		    System.out.printf("Your account balance is : %.2f",this.balance);
		}
		else {
            System.out.println("Invalid withdrawl amount.");
        }
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	 public void getAccountDetails() {
	        System.out.println("Account Number: " + accountNum);
	        System.out.println("Balance: " + balance);
	    }
}
