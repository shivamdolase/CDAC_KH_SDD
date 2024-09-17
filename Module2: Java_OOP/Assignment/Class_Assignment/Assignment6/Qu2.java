package org.example.question1;

import java.util.Scanner;

public class Qu2 {
	static Scanner sc=new Scanner(System.in);
	public static int[]  acceptRecord(int []arr){
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		return arr;
		
	}
	
	public static void printRedord(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[]) {
		
		
		int []arr=new int[5];
		
		Qu2.printRedord(arr);
		System.out.println();
		Qu2.acceptRecord(arr);
		Qu2.printRedord(arr);
		
		
		
		
		
	}
}
