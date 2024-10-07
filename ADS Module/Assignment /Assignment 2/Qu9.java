import java.util.Scanner;
class Qu9{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=str.length();
		int i=0;
		int j=n-1;
		boolean palindrome=true;
		while(i<j){
			if(str.charAt(i)!=str.charAt(j)){
				palindrome=false;
			}
			++i;
			--j;
		}
		if(palindrome){
			System.out.println("String is palindrome");
		}
		else{
			System.out.println("String is not a palindrome");
		}
	}
}