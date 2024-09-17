package org.example.instancecounter;

public class InstanceCounter {
	private static int  counter=0;
	
	InstanceCounter(){
		counter++;
	}
	
	public void printRecord() {
		System.out.println(counter);
	}
}
