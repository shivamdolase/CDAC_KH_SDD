import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.naming.LinkException;
class Tree{
	static Node root;
    static Node temp=root;
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
			left=null;
			this.right=null;
		}
		
	}
    static void bfs(Node temp){
        if(temp == null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(temp);
        while(!q.isEmpty()){
            temp=q.peek();
            q.remove();
            System.out.print(temp.data+" ");
            if(temp.left==null) continue;
            q.add(temp.left);
            if(temp.right==null) continue;
            q.add(temp.right);

        }

    }
    static void dfs(Node temp){
        if(temp == null){
            return;
        }
        Stack<Node> st=new Stack<>();
        st.push(temp);
        while(!st.isEmpty()){
            temp=st.peek();
            st.pop();
            System.out.print(temp.data+" ");
            if(temp.right==null) continue;
            st.push(temp.right);
            if(temp.left==null) continue;
            st.push(temp.left);

        }

    }
    static void inOrder(Node temp){
        if(temp == null){
            return;
        }
        inOrder(temp.left);
        System.out.print(temp.data+" ");
        inOrder(temp.right);

    }
    static void preOrder(Node temp){
        if(temp == null){
            return;
        }
        System.out.print(temp.data+" ");
        preOrder(temp.left);
        preOrder(temp.right);

    }
    static void postOrder(Node temp){
        if(temp == null){
            return;
        }
        postOrder(temp.left);
        postOrder(temp.right);
        System.out.print(temp.data+" ");

    }
    //static List<Integer> treeList=new LinkedList<>();
    public static void insert(Node temp,int key){
        
        if(temp==null){
            root=new Node(key);
            return;
        }
        Queue<Node> q=new LinkedList<Node>();
        q.add(temp);

        while(!q.isEmpty()){
            temp=q.peek();
            q.remove();

            if(temp.left==null){
                temp.left=new Node(key);
                break;
            }
            else q.add(temp.left);

            if(temp.right==null){
                temp.right=new Node(key);
                break;
            }
            else q.add(temp.right);
        }
        
    }
	public static void main(String[] args) {
        root=new Node(10);
        root.left=new Node(12);
        root.right=new Node(9);
        root.left.left=new Node(14);
        root.left.right=new Node(22);

        int key=24;
        insert(root,key);
        System.out.println("Pre order traversal of tree: ");
        preOrder(root);
        System.out.println();
        System.out.println("Inorder traversal of tree: ");
        inOrder(root);
        System.out.println();
        System.out.println("Postorder traversal of tree: ");
        postOrder(root);
        System.out.println();
        System.out.println("BFS traversal of tree: ");
        bfs(root);
        System.out.println();
        System.out.println("DFS traversal of tree: ");
        dfs(root);
        System.out.println();
        
    }

}