package org.example.question3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Qu8 arr=new Qu8();
		
		System.out.println("Enter array lengths:");
		arr.setLength(sc.nextInt());
		
		arr.setArr();
		System.out.println(arr.toString());
		

	}

}
