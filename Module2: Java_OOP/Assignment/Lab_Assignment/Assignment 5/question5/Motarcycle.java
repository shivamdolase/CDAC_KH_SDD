package org.example.question5;

public class Motarcycle extends Vehicle{
	private String model;
	

	public void startEngine() {
		engine="Motorcycle engine started.";
	}
	
	public void stopEngine() {
		engine="Motorcycle engine stopped.";
	}
	
	public Motarcycle(String make, int year, int milage, String color,String model) {
		super(make, year, milage, color);
		this.model=model;
	}

	public Motarcycle(){
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
		return super.toString()+"Motarcycle [model=" + model + "]";
	}

}
