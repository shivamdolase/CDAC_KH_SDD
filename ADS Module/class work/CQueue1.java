import java.util.Scanner;

class CQ{
	private int cq[];
	private int size,front,rear;
	CQ(int size)
	{
		this.cq=new int[size];
		this.size=size;
		this.front=-1;
		this.rear=-1;
	}
	boolean isFull(){
		return ((rear+1)%size==front);
	}
	boolean isEmpty(){
		return (front==-1);
	}
	void enqueue(int n){
		if(isFull()){
			System.out.println("Queue is Full");
			return;
		}
		if(front==-1){
			front=0;
		}
		rear=(rear+1)%size;
		cq[rear]=n;
		System.out.println(n+ "Inserted");
		
	}
	int dequeue(){
		if(isEmpty()) return -1;
		int x=cq[front];
		if(front==rear){
			front=-1;
			rear=-1;
			return x;
		}
		front =(front+1)%size;
		return x;
	}
	static void menu(){
		System.out.println("select a statement");
		System.out.println("Enqueue=eq");
		System.out.println("Dequeue=dq");
		System.out.println("Exit=ex");
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		boolean status=true;
		System.out.println("Enter Stack size;");
		
		CQ q=new CQ(sc.nextInt());
		while(status){
			menu();
			String str=sc.next();
			switch(str){
				case("eq"):
					q.enqueue(sc.nextInt());
					break;
				case("dq"):
					System.out.println(q.dequeue());
					break;
				case("ex"):
					System.out.println("Exiting...");
					status=false;
					break;
				default:
					System.out.println("Invalid  Statement");
					break;
			}

		}
		sc.close();
	}
}