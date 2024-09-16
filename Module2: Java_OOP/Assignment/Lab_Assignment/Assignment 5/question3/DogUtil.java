package org.example.question3;
import java.util.Scanner;

public class DogUtil {
	
		Scanner sc=new Scanner(System.in);
		Dog dog=new Dog();
		
		
	   public void acceptRecord(){
			System.out.println("Enter dog name:");
			dog.setName(sc.nextLine());
			
			System.out.println("Enter dog type:");
			dog.setType(sc.nextLine());
			
			
			System.out.println("Enter dog breed:");
			dog.setBreed(sc.nextLine());
			
			System.out.println("Enter dog color:");
			dog.setColor(sc.nextLine());
		}
	   
	   public void printRecord() {
		   dog.toString();	   
	   }
	   
	   void menuList() {
		   System.out.println("0.Exit");
		   System.out.println("1.acceptRecord");
		   System.out.println("2.printRecord");
		   System.out.println("Enter your choice:");
		   
		   
	   }
	   

	
}
