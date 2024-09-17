package org.example.employee;

import java.util.ArrayList;

public class Employee {
	private String  name;
	private int empid;
	private double salary;
	private String department;
	static final String company="Orsald";
	
	
	private static int empCount=0;
	private static double totalSalaryExpense =0;
	
	
	 static {
	        System.out.println("Employee management system initialized.");
	    }

	  {
	    empCount++;  
	    }
	
	Employee(){
		this("",0,0,"");
	}
	
	
	public Employee(String name, int empid, int salary, String department) {
		// TODO Auto-generated constructor stub
		
		this.salary=salary;
		this.empid=empid;
		this.name=name;
		this.department=department;
		totalSalaryExpense+=salary;
		
		
	}


	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}

	public static int getTotalEmployees() {
		return Employee.empCount;
	}

	public static void applyRaise(ArrayList<Employee> arr1, double percentage) {
		for (Employee e : arr1) {
            double raiseAmount = e.salary * (percentage / 100);
            e.setSalary(e.salary + raiseAmount);
        }
        System.out.println(percentage + "% raise applied to all employees.");
		
	}
	
	public void updateSalary(double newSalary) {
		totalSalaryExpense -= this.salary;  
        this.salary = newSalary;
        totalSalaryExpense += newSalary;
		
	}
	
	public static double getTotalSalaryExpence() {
		return totalSalaryExpense;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", salary=" + salary + ", department=" + department
				+ ", company=" + company + "]";
	}
}
