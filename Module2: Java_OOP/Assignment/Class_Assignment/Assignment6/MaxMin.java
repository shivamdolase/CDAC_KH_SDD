package org.example.question1;

import java.util.Scanner;

public class MaxMin {

	public static void main(String args[] ){
		int arr[];
		System.out.println("Enter array size");
		Scanner sc=new Scanner(System.in);
	
		arr=new int[sc.nextInt()];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		
		int maxN=arr[0];
		int minN=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			maxN=Math.max(maxN, arr[i]);
			minN=Math.min(minN, arr[i]);
		}
		
		System.out.println("Max element in arr: "+maxN);
		
		System.out.println("min element in arr: "+minN);
	}
}
