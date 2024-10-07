import java.util.Scanner;
import java.util.Stack;
class Qu6{
 	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=sc.nextLine();
		Stack<String> st=new Stack<>();
 		int n=str.length();
		String tempstr="";
		for(int i=0;i<n;i++){

			if(str.charAt(i)==' '){
                        	if (!tempstr.isEmpty()) {
					st.push(tempstr);
					tempstr="";
				}
			}
			else{
				tempstr+=str.charAt(i);
			}
		}
		if (!tempstr.isEmpty()) {
            		st.push(tempstr);
        	}
                str="";
		//System.out.println(st.peek());
		while(!st.isEmpty()){
			str+=st.pop();
			if (!st.isEmpty()) {
                		str += " ";   
            		}
		}
		System.out.println("Output: "+str);

		
	}
}