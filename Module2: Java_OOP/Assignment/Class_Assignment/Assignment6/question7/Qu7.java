package org.example.question2;

import java.util.Scanner;

public class Qu7 {
	
	private int length;
	
	int arr[];
	public void acceptRecord() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array lengths:");
	    this.length=sc.nextInt();
	    arr=new int[length];
		System.out.println("Enter array elements:");
		for(int i=0;i<length;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		
	}
	public void printRecords() {
		System.out.println("Elements of the array are:");
		for(int i=0;i<length;i++) {
			System.out.println((i+1)+"): "+arr[i]);
			
		}
	}
	

}
