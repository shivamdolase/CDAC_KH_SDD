import java.util.Scanner;
class Qu1{
         public static boolean isAmstrong(int n,int d){
		int orgn=n;
		int sum=0;
		int a;
		while(n>0){
			a=n%10;
			sum+=Math.pow(a,d);
			n=n/10;
 		}	
		if (sum==orgn){
			return true;
		}
                 return false;
       	}
         public static void main(String args[]){
	     Scanner sc=new Scanner(System.in);
             int n=sc.nextInt();
             int temp=n;
             int digit=0;
            while(temp>0){
              temp=temp/10;
              ++digit;
             }
             if(isAmstrong(n,digit)){
                   System.out.println(n+" is a amstrong number.");
	   }
            else{
                    System.out.println(n+" is not a amstrong number.");
            }
          }

}