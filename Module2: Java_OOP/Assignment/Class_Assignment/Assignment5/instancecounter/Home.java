package org.example.instancecounter;

public class Home {
	
	public static void main(String[] args) {
		InstanceCounter c1=new InstanceCounter();
		InstanceCounter c2=new InstanceCounter();
		InstanceCounter c3=new InstanceCounter();
		
		c2.printRecord();
	}
}
