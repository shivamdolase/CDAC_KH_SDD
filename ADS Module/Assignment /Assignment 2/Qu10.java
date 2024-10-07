import java.util.Scanner;

class Qu10{
	public static int[] rotateArr(int[] arr,int d){
		int n=arr.length;
		int[] one=new int[d];
		int[] two=new int[n-d];
		for(int i=0;i<d;i++){
			one[i]=arr[i];
		}
		for(int i=0;i<n-d;i++){
			two[i]=arr[i+d];
		}
		for(int i=0;i<n;i++){
			if(i<n-d){	
				arr[i]=two[i];
			}
			else{
				arr[i]=one[i-(n-d)];
			}
		}
		return arr;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length:");
		int n=sc.nextInt();

		int arr[]=new int [n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int d=sc.nextInt();
		arr=rotateArr(arr,d);
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	
	}

}
