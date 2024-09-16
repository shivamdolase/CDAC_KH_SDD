package org.example.question3;

public class Animal {
	private String name;
	private String  type;


	
	public Animal(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	public Animal(){
		this("","");
	}
	
	public void printRecord() {
		System.out.println("make="+this.name);
		System.out.println("year="+this.type);
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setType(String type) {
		this.type=type;
	}
	public String getName() {
		return  this.name;
	}
	public String gettype() {
		return this.type;
	}
	public String toString() {
		return "Animal [name=" + name + ", type=" + type + "]";
	}
	
	
	

}
