class BST{
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public static Node insert(Node root,int data){
		if(root==null){
			root=new Node(data);
			return root;
		}
		Node newN=new Node(data);
		if(data<=root.data){
			root.left= insert(root.left,data);
		}
		else{
			root.right= insert(root.right,data);
		}
		return root;
	}
	static void search(Node temp,int data,String route){
		if(temp==null){
			System.out.println("Not found");
			return;
		}
		if(temp.data==data){
			System.out.println("Root"+route);
			route="";
			return;
		}
		if(data<temp.data){
			route+=" L";
			search(temp.left,data,route);
		}
		else{
			route+=" R";
			search(temp.right,data,route);
		}
	}
	public static Node delete(Node root,int data){
		if(data<root.data){
			root.left=delete(root.left,data);
		}
		else if(data>root.data){
			root.right=delete(root.right,data);
		}
		else{
			if(root.left==null&&root.right==null){
				return null;
			}
			
			if(root.left!=null&&root.right==null){
				root.data=root.left.data;
				root.left=null;
				return root;
			}
			else if(root.left==null&&root.right!=null){
				root.data=root.right.data;
				root.right=null;
				return root;
			}

			Node IS=inSuccessor(root.right);
			root.data=IS.data;
			root.right=delete(root.right,IS.data);
		}
		return root;
	}
	static void inOrder(Node root){
		if(root==null){
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	static Node inSuccessor(Node root){
		Node temp=root;
		while(temp.left!=null){
			temp=temp.left;
		}
		return temp;
	}
	public static void main(String args[]){
		Node root=null;
		root=insert(root,12);
		root=insert(root,14);
		root=insert(root,5);
		root=insert(root,10);
		root=insert(root,4);
		root=insert(root,20);
		inOrder(root);
		System.out.println();
		
		String route="";
		search(root,12,route);
		search(root,20,route);
		search(root,6,route);
		search(root,5,route);


		delete(root,10);
		delete(root,20);

		inOrder(root);
		System.out.println();

	}
}