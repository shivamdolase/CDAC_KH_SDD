import java.util.Scanner;
class Qu2{
	public static boolean isPrime(int n,int org){
		if(n==1) return true;
                if(org%n==0) return false;
		return isPrime(n-1,org);
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
                int sqn=(int)Math.sqrt(n);
		if(isPrime(sqn,n)) {
			System.out.println(n+" is a prime number");
		}
		else{
			System.out.println(n+" is not a prime number");

		}
	}

}