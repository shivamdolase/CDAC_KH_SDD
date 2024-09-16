package org.example.question1;


public class Home {
	
	public static void main(String[] args) {
		
		 SavingsAccount myAccount = new SavingsAccount("123456789", 2000.0);

	     
	     myAccount.getAccountDetails();
	     
	    
	     myAccount.deposite(500.0);

	        
	     myAccount.withdraw(800.0);

	      
	     myAccount.withdraw(1200.0);

	        
	     myAccount.getAccountDetails();
	}

}
