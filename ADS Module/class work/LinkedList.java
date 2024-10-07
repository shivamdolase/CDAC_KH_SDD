class LinkedList{
	static Node head;
	static class Node{
		int data ;
		Node next;
		
		Node(int d){
			data =d;
			next =null;
		}
	}
	static void insertAtHead(int data){
		Node new_node=new Node(data);
		new_node.next=head;
		head=new_node;
	}
 	static void insertAfter(int key,int data){
		Node temp=head;
		while(temp.data!=key){
			if(temp.next==null) {
				System.out.println(key +" node not found in LinkedList thus not inserted");
				return;
			}
			temp=temp.next;
		}
		Node newN=new Node(data);
		newN.next=temp.next;
		temp.next=newN.next;
	}
	static void insertAtEnd(int data){
		Node newN=new Node(data);
		Node temp=head;
		if(head==null){
			head=newN;
			return;
		}
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=newN;
	}
	static int deleteHead(){
		int data=head.data;
		head = head.next;
		return data;	
	}
	static int deleteTail(){
		Node temp=head;
		while(temp.next.next!=null){
			temp=temp.next;
		}
		int data=temp.next.data;
		temp.next=null;
		return  data;
		
	}
	static int deleteEle(int key){
		Node temp=head;
		while(temp.next.data!=key){
			temp=temp.next;
		}
		int data=temp.next.data;
		temp.next=temp.next.next;
		return data;
	}
	static void display(){
		Node temp=head;
		if(head==null){
			System.out.println("Linked list is empty");
		}
		while(temp!=null){
			System.out.print(temp.data+"  -> ");
			temp=temp.next;
		}
		System.out.println("null");
	}
	static boolean searchEle(int key){
		Node temp=head;
		while(temp!=null){
			if(temp.data==key){	
				return true;
			}
		}
		return false;
	}
	static int listLength(){
		int count=0;
		Node temp=head;
		while(temp!=null){
			++count;		
		}
		return count;
	}
	static void reverseList(){
		//System.out.println("h-"+head.data);
		Node curr=head, prev=null,post;
		while(curr!=null){
			//System.out.println("c-"+curr.data);
			post=curr.next;
			
			curr.next=prev;
			prev=curr;
			curr=post;
			
		}
		//System.out.println(prev.data);
		head=prev;
	}

	/*1  2  3  4  5  6  13  25   7  10
                +             *    
	*/   
    
	static void middleEle(){
		Node ptr1=head;//fast pointer 
		Node ptr2=head;//slow pointer
		while(ptr1.next!=null&&ptr1.next.next!=null){

			ptr1=ptr1.next.next;
			ptr2=ptr2.next;
		}
		System.out.println("the middle point is: "+ptr2.data);
	}
	
	public static void main(String args[]){
		LinkedList l1=new LinkedList();
		insertAtHead(10);
		insertAtHead(7);
		insertAtEnd(6);
		insertAtHead(5);
		insertAtEnd(16);
		insertAtHead(5);
		insertAtEnd(6);
		insertAtHead(5);
		insertAtEnd(6);
		display();
		System.out.println(" head node "+deleteHead()+" is deleted");
		display();
		System.out.println(" Tail node "+deleteTail()+" is deleted");
		display();
		System.out.println(" Delete node with value: 5");
		System.out.println(" Node with value "+deleteEle(5)+" is deleted");
		display();
		reverseList();
		display();

		middleEle();
		insertAtEnd(9);
		display();

		middleEle();	
	}
}

/*
Linked List Insertion
Search an element in a Linked List (Iterative and Recursive)
Find Length of a Linked List (Iterative and Recursive)
Reverse a linked list
Linked List Deletion (Deleting a given key)
Linked List Deletion (Deleting a key at given position)
Write a function to delete a Linked List
Write a function to get Nth node in a Linked List
Nth node from the end of a Linked List
*/
/*
Linked List Applications
Implementing stacks and queues using linked lists.
Using linked lists to handle collisions in hash tables.
Representing graphs using linked lists.
Allocating and deallocating memory dynamically.
*/




