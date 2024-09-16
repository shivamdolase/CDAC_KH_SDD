package org.example.question5;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Vehicle vh=new Vehicle();
		Motarcycle mt=new Motarcycle();
		Car car=new Car();
		
		
		System.out.println("Start Vehicle:");
		vh.startEngine();
		System.out.println(vh.engine);
		
		System.out.println("Stop Vehicle:");
		vh.stopEngine();
		System.out.println(vh.engine);
		
		
		System.out.println("Start Motorcycle:");
		mt.startEngine();
		System.out.println(vh.engine);
		
		
		System.out.println("Stop Motorcycle:");
		mt.stopEngine();
		System.out.println(vh.engine);
		
		System.out.println("Start Car:");
		car.startEngine();
		System.out.println(vh.engine);
		
		System.out.println("Stop Car:");
		car.stopEngine();
		System.out.println(vh.engine);
		
		
		
	}

}
