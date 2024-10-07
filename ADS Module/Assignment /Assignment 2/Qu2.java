import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
class Qu2{
 	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length:");
		int n=sc.nextInt();

		int arr[]=new int[n];
		Set<Integer> set=new HashSet<Integer>();

		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
 			set.add(arr[i]);
		}
		
		System.out.println("array size: "+set.size());


		
	}
}