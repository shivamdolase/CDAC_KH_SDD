package org.example.employee;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		EmployeeUtil emp=new EmployeeUtil();
		
		emp.menuList();
		
		int choice=1;
		choice=sc.nextInt();
		
		while(choice!=0) {
			
			
			switch(choice) {
			case 0:
				System.out.println("Exiting....");
				break;
			case 1:
				emp.addEmployee();
				break;
			case 2:
				emp.applyRaise();
				break;
			
			case 3:
				emp.updateSalary();
				break;
			case 4:
				emp.displaaycompanyRecords();
				break;
			case 5:
				emp.dipalyEmployee();
				break;
			default:
				System.out.println("Entered wrong choice.");
				
				
			}
			emp.menuList();
			choice=sc.nextInt();
		
		}
	}	
		

}
