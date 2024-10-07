import java.util.Scanner;
class Qu9{
        
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int n2=0; 
                
		while(temp>0){
                 	int t=temp%10;
			temp=temp/10;
			n2+=t;
			n2*=10;
                }
		n2=n2/10;
		
		if(n==n2){
			System.out.println("palindrome number");
		}else{
			System.out.println("not a palindrome");
		}

	}

}
5,14,53,32,87,90,2,50 max heap