package org.example.question1;

import java.util.Scanner;

public class MissingNum {

	public static void main(String[] args) {
		int arr[];
		System.out.println("Enter array size");
		Scanner sc=new Scanner(System.in);
		
		arr=new int[sc.nextInt()];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		
		int ele=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=ele) {
				System.out.println("Missing element:"+ele);
				break;
			}
			++ele;
		}

	}

}
