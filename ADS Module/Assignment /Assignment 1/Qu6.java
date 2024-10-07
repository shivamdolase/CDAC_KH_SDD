import java.util.Scanner;
class Qu6{
        
	public static int numSqrt(int n,int result){
		if(n*n<=result) return n;
                return numSqrt(n-1,result);
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
                
		System.out.println(numSqrt(n/2,n));

	}

}