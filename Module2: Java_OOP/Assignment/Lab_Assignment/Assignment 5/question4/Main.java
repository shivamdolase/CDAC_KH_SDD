package org.example.question4;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Students st=new Students();
		
		System.out.println("enter student name:");
		st.setName(sc.nextLine());
		
		System.out.println("enter student rollno:");
		st.setRollNo(sc.nextInt());
		
		sc.nextLine();
		System.out.println("enter student's classgrade:");
		st.setGrade(sc.nextLine());
		
		System.out.println("enter student division:");
		st.setdiv(sc.next().charAt(0));
		
		
		System.out.println("The informnation about student is:");
			
		System.out.println(st.toString());
	}

}
