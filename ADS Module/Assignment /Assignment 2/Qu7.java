import java.util.Scanner;

class Qu7{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);	
		int n=sc.nextInt();
		int temp=0;
		while(n>0){
			temp+=n%10;
			temp*=10;
			n=n/10;
		}
		temp=temp/10;
		System.out.println(temp);
	}
}