package org.example.question3;
import java.util.Scanner;

public class Program {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		DogUtil dog=new DogUtil();
		
		dog.menuList();
		int choice;
		choice=sc.nextInt();
		while(choice!=0) {
			switch(choice) {
			case 1:
				dog.acceptRecord();
			    break;
			case 2:
				dog.printRecord();
				break;
			case 0:
				System.out.println("Exiting...");
			default:
				System.out.println("Enter another choice among 0,1 or 2.");
			
			}
			dog.menuList();
			
			choice=sc.nextInt();
		}
	}

	
}
