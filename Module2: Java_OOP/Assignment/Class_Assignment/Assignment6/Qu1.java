package org.example.question1;

import java.util.Scanner;

public class Qu1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int []arr=new int[5];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
