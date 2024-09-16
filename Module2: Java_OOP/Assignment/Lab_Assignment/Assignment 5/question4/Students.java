package org.example.question4;

public class Students {
	private String name;
	private int  rollno;
	private String grade;
	private char div;
	
	
	Students(String name,int rollno,String grade,char div){
		this.name=name;
		this.rollno=rollno;
		this.grade=grade;
		this.div=div;
	}
	Students(){
		this("",0,"",' ');
	}
	
	
	public String getName(){
		return name;
	}
	public int getRollNo() {
		return rollno;
	}
	
	public String getGrade() {
		return grade;
	}
	public char getDiv() {
		return div;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setRollNo(int rollno) {
		this.rollno=rollno;
	}
	public void setGrade(String grade) {
		this.grade=grade;
	}
	public void setdiv(char div) {
		this.div=div;
	}
	
	public String toString() {
		return "[ Studnnt name= "+name+" Rollno= "+rollno+" Graade= "+grade+" Divisoin= "+div+" ]";
	}
	
	


	
	
	

}
