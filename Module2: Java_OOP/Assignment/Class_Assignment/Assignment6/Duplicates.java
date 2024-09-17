package org.example.question1;

import java.util.HashSet;
import java.util.Scanner;

public class Duplicates {

	public static void main(String[] args) {
		int arr[];
		System.out.println("Enter array size");
		Scanner sc=new Scanner(System.in);
		
		HashSet<Integer> set=new HashSet<>();
		
	
		arr=new int[sc.nextInt()];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
			set.add(arr[i]);
		}
		
		int arr1[]=new int[set.size()];
		int idx=0;
		for(int i:set) {
			arr1[idx++]=i;
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		
		

	}

}
