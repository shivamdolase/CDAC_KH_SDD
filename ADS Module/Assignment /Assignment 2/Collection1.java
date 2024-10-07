import java.util.Scanner ; 
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

class Collection1{
	public static void printDup(List<Integer> arr){
		HashMap<Integer,Integer> map=new HashMap<>();
		int n=arr.size();
		
		for(int i=0;i<n;i++){
			map.put(arr.get(i),map.getOrDefault(arr.get(i),0)+1);
		}
		for(Integer i:map.keySet()){
			if(map.get(i)>1){
				System.out.print(i+" ");	
			}
		}
		System.out.println();
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		List<Integer> l1=new ArrayList<>();
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++){
			l1.add(sc.nextInt());
		}
		printDup(l1);
	}
}