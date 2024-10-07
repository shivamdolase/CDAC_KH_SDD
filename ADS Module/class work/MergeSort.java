class MergeSort{
	static void mergeSort(int arr[],int si,int ei){
		if(si<ei){
			int mid =si+(ei-si)/2;
			mergeSort(arr,si,mid);
			mergeSort(arr,mid+1,ei);
                        merge(arr,si,mid,ei);
		}
	}
	static void merge(int[] arr, int si,int mid,int ei){
		int marr[]=new int[ei-si+1];
		int idx1=si;
		int idx2=mid+1;
		int x=0;
		while(idx1<=mid&&idx2<=ei){
			if(arr[idx1]<=arr[idx2]){
				marr[x++]=arr[idx1++];
				
			}
			else{
				marr[x++]=arr[idx2++];
			}
		}
		while(idx1<=mid){
			marr[x++]=arr[idx1++];
		}
		while(idx2<=ei){
			marr[x++]=arr[idx2++];
		}
		int j=si;
		for(int i=0;i<marr.length;i++){
			arr[j++]=marr[i];
		}
		
	}
	public static void main(String args[]){
		int arr[]={5,6,2,13,1,4};
		int n=arr.length;
		for(int i:arr){
			System.out.print(i+" ");
		}
		System.out.println();
		
		mergeSort(arr,0,n-1); 
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
