package Ds;

class BinaryTree{
		Node root;
		class Node{
			int data;//data in node
			Node left;//left node add
			Node right;//right node add
			
			public Node(int d) {//create new node
				data = d;//assgign data
				left = null;//left add is no so null
				right = null;//right add is no so null;
			}
		}
		public BinaryTree(int d) {
				root=new Node(d);
			}
		public void insertLeft(Node r,int val) {
			Node newNode = new Node(val);
			r.left = newNode;
		}
		public void insertRight(Node r,int val) {
			Node newNode = new Node(val);
			r.right = newNode;
		}
		public static void preorder(Node root) {
			if(root != null) {
				System.out.print(root.data+" ");
				preorder(root.left);
				preorder(root.right);
			}
		}
		public static void postorder(Node root) {
			if(root != null) {
				postorder(root.left);
				postorder(root.right);
				System.out.print(root.data+" ");
			}
		}
		public static void inorder(Node root) {
			if(root != null) {
				inorder(root.left);
				System.out.print(root.data+" ");
				inorder(root.right);
			}
		}
}
public class trees {
	
	
	public static void main(String[] args) {
		
		   BinaryTree tree = new BinaryTree(10);//
		   tree.insertLeft(tree.root,5);//rl
		   tree.insertRight(tree.root,8);//rr
		   tree.insertLeft(tree.root.left,3);//rll
		   tree.insertRight(tree.root.left,2);//rlr
		   tree.insertRight(tree.root.right,1);
		   System.out.print("pre order :");//dlr
		   BinaryTree.preorder(tree.root);   
		   System.out.println("");
		   System.out.print("post order :");//lrd
		   BinaryTree.postorder(tree.root);
		   System.out.println("");
		   System.out.print("inorder :");//ldr
		   BinaryTree.inorder(tree.root);
	}

}
