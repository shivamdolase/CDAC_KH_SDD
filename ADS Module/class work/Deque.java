class Deque{
	stasic final int max=100;
	int  dQ[];
	int front,rear,size;
	
	public Deque(int size){
		dQ[]=new int[size];
		rear=-1;
		front =0;
		this.size=size;
	}

	boolean isFull(){
		return ((front == 0 && rear == size -1)|| front == rear+1);
	}
	boolean isEmpty(){
		if(front==-1||front ==rear)
	}	




}