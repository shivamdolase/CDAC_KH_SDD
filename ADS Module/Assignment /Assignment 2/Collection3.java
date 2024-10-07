import java.util.Scanner;
import java.util.HashMap;

class Collection3{

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		HashMap<Character,Integer> map =new HashMap<>();
		for(int i=0;i<str.length();i++){
			    map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
		}
		for(int i=0;i<str.length();i++){
			if(map.get(str.charAt(i))==1){
				System.out.print(str.charAt(i));
				break;
			}
		}
	}
}