package org.example.loggersingleton;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Logger log1=Logger.getInstance();
		Logger log2=Logger.getInstance();
		
		Scanner sc=new Scanner(System.in);
		int count=0;
		
		System.out.println("Enter log message no: "+count);
		log1.log(sc.nextLine());
		//System.out.println(log1.getLog());
		
		System.out.println("Enter log message no: "+count);
		log1.log(sc.nextLine());
		//System.out.println(msg);
		System.out.println("Log message is : "+log1.getLog());
		
		
		log2.clearLog();
		
		System.out.println(log1.getLog());
		
	}
}
