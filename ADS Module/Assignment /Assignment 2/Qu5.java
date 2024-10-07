import java.util.Scanner;
import java.util.Stack;
class Qu5{
 	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length:");
		int n=sc.nextInt();

		int arr[]=new int[n];
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
 			st.push(arr[i]);
		}
		
		for(int i=0;i<n;i++){
			arr[i]=st.pop();
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		
	}
}