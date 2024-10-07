import java.util.Scanner;

class BubbleSort{
	static void display(int arr[]){
		int n=arr.length;
		for(int i:arr){
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("******************");
	}
	static int[] bSort(int arr[]){
		int  n=arr.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				display(arr);
			}
			System.out.println("******************");
			display(arr);
			System.out.println();
			System.out.println();

		}
		return arr;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		display(arr);
		bSort(arr);
		display(arr);
	}
}