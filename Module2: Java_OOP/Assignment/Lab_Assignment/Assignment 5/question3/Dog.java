package org.example.question3;

public class Dog extends Animal {
	private String breed;
	private String color;
	
	
//	private int numSeat;
//	private int doors;
	
	
	public Dog(String name, String type,String breed,String color) {
		super(name,type);
		this.breed=breed;
		this.color=color;
	}

	public Dog(){
		this("","","","");
	}
	
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void printRecord() {
		super.printRecord();
		System.out.println("breed="+this.breed);
		System.out.println("color="+this.color);
		
	}

	@Override
	public String toString() {
		return super.toString()+"Dog [Breed=" + breed + "color="+ color + "]";
	}

	
	
	
	
	
}
