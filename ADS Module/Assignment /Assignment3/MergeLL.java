class MergeLL{
    static class Node{
		int data ;
		Node next;
		
		Node(int d){
			data =d;
			next =null;
		}
	}
    static Node mergeLL(Node head1,Node head2){
        if(head1==null) return head2;
        if(head2==null) return head1;
        Node head3;
        Node temp1=head1;
        Node temp2=head2;

        
        if(temp1.data<=temp2.data){
            head3=new Node(temp1.data);
            temp1=head1.next;
        }
        else{
            head3=new Node(temp2.data);
            temp2=head2.next;
        }
        Node temp3=head3;
        while(temp1!=null && temp2!=null){
            if(temp1.data<=temp2.data){
                temp3.next=new Node(temp1.data);
                temp1=temp1.next;
            }
            else{
                temp3.next=new Node(temp2.data);
                temp2=temp2.next;
            }
            temp3=temp3.next;
        }
        while(temp1!=null){
            temp3.next=new Node(temp1.data);
            temp1=temp1.next;
            temp3=temp3.next;
        }
        while(temp2!=null){
            temp3.next=new Node(temp2.data);
            temp2=temp2.next;
            temp3=temp3.next;
        }
        return head3;
    }
    static void display(Node head){
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
    static int findNth(Node head,int n){

        Node slow=head,fast=head;

        while(n>0&&fast!=null){
            fast=fast.next;
            --n;
        }
        if(fast==null){
            return -1;
        }
        while(fast!=null&&slow!=null){
            slow=slow.next;
            fast=fast.next;
        }
        if(slow==null){
            return -1;
        }

        return slow.data;
    }
    static int listLength(Node head){
		int count=0;
		Node temp=head;
		while(temp!=null){
			++count;		
		}
		return count;
	}
    static Node removeDup(Node head){
        Node temp=head;
        while(temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
                continue;
            }
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args)
    {

        // Create a hard-coded linked list:
        // 2 -> 4 -> 8 -> 9
        Node a = new Node(2);
        a.next = new Node(4);
        a.next.next = new Node(8);
        a.next.next.next = new Node(9);

        // Create another hard-coded linked list:
        // 1 -> 3 -> 8 -> 10
        Node b = new Node(1);
        b.next = new Node(3);
        b.next.next = new Node(8);
        b.next.next.next = new Node(10);

        Node res = mergeLL(a, b);

        display(res);
        System.out.println(findNth(res,2));
        
        res = removeDup(res);
        display(res);

    }
}