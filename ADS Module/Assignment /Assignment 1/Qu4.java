import java.util.Scanner;
class Qu4{
        
	public static int fib(int n){
		if(n==1||n==2) return 1;
                //System.out.println((fib(n-1)+fib(n-2));
                return fib(n-1)+fib(n-2);
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
                if(n==0){
                       System.out.println(0);
                }
		for(int i=1;i<=n;i++){
			System.out.println(fib(i));

		}

	}

}

