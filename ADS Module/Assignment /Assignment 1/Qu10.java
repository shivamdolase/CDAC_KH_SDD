import java.util.Scanner;
class Qu10{
        
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
                
		if(n%400==0||n%4==0 && n%100!=0)
		{
			System.out.println("Leap year");
		}
		else{
			System.out.println("Not a Leap year");
		}

	}

}