package Ds;

class Doublylinkedlist{
	Node head;
	class Node{
		int data;
		Node prev;
		Node Next;
		Node(int val){
			data= val;
			prev = null;
			Next = null;
		}
	}
	Doublylinkedlist(){
		head = null;
	}
	public void insertatbeg(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
		}
		else {
			newNode.Next=head;
			head.prev=newNode;
			head=newNode;
		}
	}
	public void traverse() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.Next;
		}
		System.out.println();
	}
	public void updateatpos(int data,int pos) {
		Node temp = head;
		for(int i=1;i<pos;i++) {
			temp = temp.Next;
		}
		temp.data=data;
	}
	public void updateAtposition(int pos,int data) {
		Node temp = head;
		int currentPosition=1;
		while(temp!= null && currentPosition!=pos) {
			temp = temp.Next;
			currentPosition++;
		}
		if(temp!=null) {
			temp.data=data;
		}
		else {
			System.out.println("invalid position");
		}
	}
	
}

public class Dlinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doublylinkedlist dll = new Doublylinkedlist();
		dll.insertatbeg(10);
		dll.insertatbeg(150);
		dll.traverse();
//		dll.updateatpos(12, 2);
		dll.updateAtposition(2, 12);
		dll.traverse();
	}

}
