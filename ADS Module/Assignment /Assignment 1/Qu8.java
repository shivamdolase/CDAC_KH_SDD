import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
class Qu8{
        
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
                Map<Character, Integer> map = new HashMap<>();
                for(int i=0;i<str.length;i++){
			map.put(str.charAt(i))++);
		}
               
                for(int i=0;i<str.length;i++){
			if(map(str.charAt(i)))==1) {
				System.out.println(str.charAt(i));
                                break;
			}
		}
                
		

	}

}