class QuickSort{
	static void quickSort(int arr[],int low,int high){
		if(low<high){
			int mid =partition(arr,low,high);
			quickSort(arr,low,mid-1);
			quickSort(arr,mid+1,high);
                        
		}
	}
	static int partition(int[] arr, int low, int high){
		int pivot=high;
		while(low<high){
			if(pivot==high){	
				if(arr[pivot]<arr[low]){
					int temp=arr[low];
					arr[low]=arr[high];
					arr[high]=temp;
					pivot=low;
					high--;
					continue;
				}
				++low;
			}
			else if(pivot==low){
				if(arr[pivot]>arr[high]){
					int temp=arr[low];
					arr[low]=arr[high];
					arr[high]=temp;
					pivot=high;
					low++;
					continue;
				}
				high--;
			}
		}
		return pivot;
	}
	public static void main(String args[]){
		int arr[]={5,6,2,13,1,4};
		int n=arr.length;
		for(int i:arr){
			System.out.print(i+" ");
		}
		System.out.println();
		
		quickSort(arr,0,n-1); 
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}

