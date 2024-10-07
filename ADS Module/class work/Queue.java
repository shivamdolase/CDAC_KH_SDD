class Queue{
	int Q[]=new int[10];
	int front=-1,rear=-1;
    int size=10;
	boolean isFull(){
		return (rear==size-1);
	}
	void enqueue(int x)
	{
		if(isFull()){
			System.out.println("Queue is full !");
		}
		else{
			if(front==-1){
				front =0;
			}
			rear++;
			Q[rear] = x;
			System.out.println(x+ "Inserted");
		}
	}
	boolean isEmpty(){
		if(front ==-1|| front>rear){
			if(front>rear){
				front=-1;
				rear=-1;
			}
			return true;
		}
		return false;
	}
	int  dequeue()
	{
		if(isEmpty()){
			System.out.println("Queue is full !");
                        return -1;
		}
		else{
			int x=Q[front];
			System.out.println(x+ "Deleted");
			front++;
                        return x;
		}
	}
	void display(){
		if(isEmpty()){
			System.out.println("empty queue !");
		}
		else{
			System.out.println("Queue elements: ");
			for(int i=front;i<=rear;i++){
				System.out.print(Q[i]+" " );
			}
			System.out.println();
		}
	}
	public static void main(String args[]){
		Queue q1=new Queue();
  		q1.enqueue(5);
  		q1.enqueue(6);
  		q1.enqueue(3);
  		q1.enqueue(7);
  		q1.enqueue(19);
		q1.display();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.display();


	}
}