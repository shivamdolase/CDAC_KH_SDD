package org.example.question9;

import java.util.Arrays;
import java.util.Scanner;

public class Qu9 {
	private int seatArr[][];
	private int row;
	private int col;
	
	
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public int[][] getSeatArr() {
		return seatArr;
	}
	public void setSeatArr(int row,int col) {
		this.seatArr = new int[row][col];
	}
	
	
	public void bookSeat(int row,int col) {
		this.seatArr[row-1][col-1]=1;
	}
	public void cancleSeat(int row,int col) {
		this.seatArr[row-1][col-1]=0;
	}
	
	public void checkAvalability(int row,int col) {
		if(this.seatArr[row-1][col-1]==0)
			System.out.println("The  desired seat is avaliable.");
		else System.out.println("The desidered seat is not avaliable.");
	}
	
	public void seatingChart() {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(seatArr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void menuList() {
		System.out.println("Select the option:");
		System.out.println("0.Exit.");
		System.out.println("1.Book the ticket:");
		System.out.println("2.Cancle the ticket");
		System.out.println("3.Check if the desired seat is avaliable:");
		System.out.println("4.Display the seat Allocatment:");
	}
	

}
//•	Initialize the seating arrangement with a given number of rows and columns.
//•	Book a seat to mark it as occupied.
//•	Cancel a booking to mark a seat as available.
//•	Check seat availability to determine if a specific seat is available.
//•	Display the current seating chart.

