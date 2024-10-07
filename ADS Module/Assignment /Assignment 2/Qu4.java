import java.util.Scanner;
import java.util.Stack;
class Qu4{
 	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=sc.nextLine();
		Stack<Character> st=new Stack<>();
 		int n=str.length();
		for(int i=0;i<n;i++){
			st.push(str.charAt(i));
		}
                str="";
		for(int i=0;i<n;i++){
			str+=st.pop();
		}
		System.out.println("Output: "+str);

		
	}
}