package org.example.question5;

public class Vehicle {
	private String make;
	private int  year;
	private int milage;
	private String color;
	String engine;

	
	public void startEngine() {
		engine="Vehicle engine started.";
	}
	
	public void stopEngine() {
		engine="Vehicle engine stopped.";
	}
	public Vehicle(String make, int year, int milage, String color) {
		
		this.make = make;
		this.year = year;
		this.milage = milage;
		this.color = color;
		
	}
	public Vehicle(){
		this("",0,0,"");
	}
	
	public void printRecord() {
		System.out.println("make="+this.make);
		System.out.println("year="+this.year);
		System.out.println("milage="+this.milage);
		System.out.println("color="+this.color);
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return "Vehicle [make=" + make + ", year=" + year + ", milage=" + milage + ", color=" + color + "]";
	}
	
	
	

}
