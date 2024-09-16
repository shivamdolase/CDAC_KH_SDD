package org.example.question2;
import java.util.Scanner;

public class CarUtil {
	
		Scanner sc=new Scanner(System.in);
		Car car=new Car();
		
		
	   public void acceptRecord(){
			System.out.println("Enter maker of car:");
			car.setMake(sc.nextLine());
			
			System.out.println("Enter year of manifacturing  of car:");
			car.setYear(sc.nextInt());
			
			System.out.println("Enter milage of car:");
			car.setMilage(sc.nextInt());
			
			sc.nextLine();
			
			System.out.println("Enter Color of car:");
			car.setColor(sc.nextLine());
			
			System.out.println("Enter Model of car:");
			car.setModel(sc.nextLine());
		}
	   
	   public void printRecord() {
		   System.out.println("Manufacturer: "+car.getMake());
		   System.out.println("Manufacturer: "+car.getYear());
		   System.out.println("Manufacturer: "+car.getMilage());
		   System.out.println("Manufacturer: "+car.getColor());
		   System.out.println("Manufacturer: "+car.getModel());
		   
	   }
	   
	   void menuList() {
		   System.out.println("0.Exit");
		   System.out.println("1.acceptRecord");
		   System.out.println("2.printRecord");
		   System.out.println("Enter your choice:");
		   
		   
	   }
	   

	
}
