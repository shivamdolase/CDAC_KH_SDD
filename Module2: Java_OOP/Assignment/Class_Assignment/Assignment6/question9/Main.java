package org.example.question9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Qu9 arr=new Qu9();
		System.out.println("Enter the seat number of rows:");
		int row=sc.nextInt();
		arr.setRow(row);
		System.out.println("Enter the seat number of columns:");
		int col=sc.nextInt();
		arr.setCol(col);
		arr.setSeatArr(row,col);
		
		int choice=1;
		arr.menuList();
		
		
		System.out.println("Select a option.");
		choice=sc.nextInt();
		
		while(choice!=0) {
			switch(choice) {
			case 0:
				System.out.println("Exiting....");
				break;
			case 1:
				System.out.println("Enter the row number");
				row=sc.nextInt();
				System.out.println("Enter the seat number");
				col=sc.nextInt();
				arr.bookSeat(row, col);
				break;
			case 2:
				System.out.println("Enter the row number");
				row=sc.nextInt();
				System.out.println("Enter the seat number");
				col=sc.nextInt();
				arr.cancleSeat(row, col);
				break;
			case 3:
				System.out.println("Enter the row number");
				row=sc.nextInt();
				System.out.println("Enter the seat number");
				col=sc.nextInt();
				arr.checkAvalability(row, col);
				break;
			case 4:
				System.out.println("The Aeroplane Seat arrangement:");
				arr.seatingChart();	
			}
			arr.menuList();
			
			
			System.out.println("Select a option.");
			choice=sc.nextInt();
			
		}

	}

}
