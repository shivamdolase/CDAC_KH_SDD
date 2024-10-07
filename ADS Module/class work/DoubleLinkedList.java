import java.util.Scanner;

class DoubleLinkedList{
	static Node head;
        static Node tail;
	static class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
		
	}

	public static void insertAtHead(int data){
		Node newNode=new Node(data);
		if(head==null){
			head=newNode;
			tail=newNode;
			return;
		}
		
		newNode.next=head;
		head.prev=newNode;
		head=newNode;
		if(head.next.next==null){
			tail=head.next;
			tail.prev=head;
		}
	}
	public static void insertAtTail(int data){
		Node newNode=new Node(data);
		if(head==null){
			insertAtHead(data);
			return;
		}
		tail.next=newNode;
		newNode.prev=tail;
		tail=newNode;
		if(tail.prev.prev==null){
			tail.prev=head;
		}
	}
	public static void insertAfter(int key,int data){
		Node newNode=new Node(data);
		
		if((head.data==key&&head.next==null)||tail.data==key){
			insertAtTail(data);
			return;
		}

		Node temp=head;
		while(temp.data!=key||temp!=null){
			temp=temp.next;
		}
		if(temp==null){
			return;
		}
		newNode.next=temp.next;
		newNode.next.prev=newNode;
		temp.next=newNode;
		newNode.prev=temp;
		
	}
	public static void insertBefore(int key,int data){
		if((head.data==key)||(tail.data==key && tail.prev==null)){
			insertAtHead(data);
			return;
		}
		Node newNode=new Node(data);
		Node temp=head;
		while(temp.data!=key||temp!=null){
			temp=temp.next;
		}
		if(temp==null){
			return;
		}
		newNode.prev=temp.prev;
		newNode.prev.next=newNode;
		temp.prev=newNode;
		newNode.next=temp;
		
	}
	public static void displayForward(){
		Node temp=head;
                System.out.print("null --> ");
		while(temp!=null){
			System.out.print(temp.data+" --> ");
			temp=temp.next;
		}
		System.out.println(" null");
	}
	public static void displayBackward(){
		Node temp=tail;
                System.out.print("null ");
		while(temp!=null){
			System.out.print(" <-- "+temp.data);
			temp=temp.prev;
		}
		System.out.println(" <-- null");
	}

	public static void deleteAtHead(){
		Node temp=head.next;
		head.next=null;
		temp.prev=null;
		head=temp;
	}
	public static void deleteAtTail(){
		Node temp=tail.prev;
		tail.prev=null;
		temp.next=null;
		tail=temp;
	}
	public static void deleteEle(int data){
		if(head.data==data){
			deleteAtHead(data);
			return;
		}
		if(tail.data==data){
			deleteAtTail(data);
			return ;
		}
		Node temp=head;
		while(temp.data!=data||temp1=null){
			temp=temp.next;
		}
		if(temp==null){
			return;
		}
		temp.prev.next=temp.next;
		temp.next.prev=temp.prev;
		temp.next=null;
		temp.prev=null;
	}
	public static int middleEle(){
		Node fast=head;
		Node slow=head;
		while(fast.next!=null && fast.next.next!=null){
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow.data;
	}
	public static boolean searchEle(int data){
		if(head.data==data||tail.data==data){
			return true;
		}
		Node temp=head;
		while(temp.data!=data||temp!=null){
			temp=temp.next;
		}
		if(temp!=null){ return true;}
		
		return false;
	}
	public static void main(String args[]){
		insertAtHead(23);
		displayForward();
		insertAtTail(24);
		displayBackward();
	}
}
/*DLL is adata structure that contains nodes which contain refrence to both previous and next pointer.*/