package org.example.question2;

public class Car extends Vehicle {
	private String model;
	
//	private int numSeat;
//	private int doors;
	
	
	public Car(String make, int year, int milage, String color,String model) {
		super(make, year, milage, color);
		this.model=model;
	}

	public Car(){
		this("",0,0,"","");
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void printRecord() {
		super.printRecord();
		System.out.println("model="+this.model);
		
	}

	@Override
	public String toString() {
		return super.toString()+"Car [model=" + model + "]";
	}

	
	
	
	
	
}
