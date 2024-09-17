package org.example.employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeUtil {
	 
	
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Employee> arr1=new ArrayList<Employee>();
		
	   public void addEmployee(){
		   Employee emp1=new Employee();
			System.out.println("Enter employee name:");
			emp1.setName(sc.nextLine());
			
			System.out.println("Enter employee id:");
			emp1.setEmpid(sc.nextInt());
			
			System.out.println("Enter employee salary:");
			emp1.setSalary(sc.nextDouble());
			
			sc.nextLine();
			System.out.println("Enter employee department:");
			emp1.setDepartment(sc.nextLine());
			
			emp1.toString();
			arr1.add(emp1);
			System.out.println("Employee record added successfully.");
			
		}
	   
	   public void displaaycompanyRecords() {
		   
		   //totalsalaryexpence
		   //total employee 
		   System.out.println("Company name:"+Employee.company);
		   System.out.println("Total employees in company:"+Employee.getTotalEmployees());
		   System.out.println("Total salary expenseo of  company:"+Employee.getTotalSalaryExpence());
		   
	   }
	   public void applyRaise() {
		   System.out.println("Enter percentage raise to apply: ");
	        
	        Employee.applyRaise(arr1, sc.nextDouble());
		   
   	   }
	   public void updateSalary() {
		   System.out.println("Enter employee ID to update salary: ");
	       int empId = sc.nextInt(); 
		   for(Employee emp:arr1) {
			   if(emp.getEmpid()==empId) {
				  System.out.println("Enter new salary: ");
	              emp.updateSalary(sc.nextDouble());
	              System.out.println("Salary updated successfully.");
	              return;
			   }
		   }
		   
   	   }
	   public void dipalyEmployee() {
		   for(Employee emp:arr1) {
			   System.out.println(emp.toString());
		   }
	   }
	   
	   
	   void menuList() {
		   System.out.println("\n--- Employee Management System ---");
           System.out.println("1. Add Employee");
           //System.out.println("2. Display Total Employees");
           System.out.println("2. Apply Raise to All Employees");
           System.out.println("3. Update Employee Salary");
           System.out.println("4. Display company Records");
           //System.out.println("5. Display Total Salary Expense");
           System.out.println("5. Display All Employees");
           System.out.println("0. Exit");
           System.out.print("Choose an option: ");
		   
		   
	   }
	   
	   
	
}
