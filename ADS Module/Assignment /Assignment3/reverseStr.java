import java.util.Scanner;

class RStr{
	private char stack[];
	private int size,top;
	RStr(int size){
		this.stack=new char[size];
		this.size=size;
		this.top=-1;
	}
	boolean isFull(){
		return top==size-1;
	}
	boolean isEmpty(){
		return top==-1;
	}
	void push(char str){
		if(isFull()){
			return ;
		}
		stack[++top]=str;
		
		
	}
	char pop(){
		if(isEmpty()){
			return '\0';
		}
		return stack[top--];
	}
	
	

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=str.length();
		RStr st=new RStr(n);
		for(int i=0;i<n;i++){
			st.push(str.charAt(i));
		}
		str="";
		for(int i=0;i<n;i++){
			str+=st.pop();
		}
		System.out.println(str);
		sc.close();
	}
}