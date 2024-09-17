package org.example.question3;

import java.util.Arrays;
import java.util.Scanner;

public class Qu8 {
	Scanner sc=new Scanner(System.in);
	private int arr[];
	private int length;
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		
		this.length = length;
	}

	public int[] getArr() {
		return this.arr;
	}

	public void setArr() {
		System.out.println("Enter array elements:");
		arr=new int[length];
		for(int i=0;i<this.length;i++) {
			this.arr[i]=sc.nextInt();
		}
		
	}

	@Override
	public String toString() {
		return "Array elements are : [arr=" + Arrays.toString(arr) + ", length=" + length + "]";
	}
	
	

}
