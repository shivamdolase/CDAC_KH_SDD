package org.example.question2;
import java.util.Scanner;

public class Program {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		CarUtil car=new CarUtil();
		
		car.menuList();
		int choice;
		choice=sc.nextInt();
		while(choice!=0) {
			switch(choice) {
			case 1:
				car.acceptRecord();
			    break;
			case 2:
				car.printRecord();
				break;
			case 0:
				System.out.println("Exiting...");
			default:
				System.out.println("Enter another choice among 0,1 or 2.");
			
			}
			car.menuList();
			
			choice=sc.nextInt();
		}
	}

	
}
