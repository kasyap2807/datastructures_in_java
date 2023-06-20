package Ds;
//file name: Queue
class ArrayQueue{
	static final int max_size=5;
	int arr[];
	int front,rear;
	ArrayQueue(){
		arr = new int[max_size];
		front = -1;
		rear = -1;
	}
	public void enqueue(int data) throws Exception {
		if(rear==max_size-1) {
			throw new Exception("queue overflow");
		}
		if(front==-1) {
			front++;
		}
		arr[++rear]=data;
	}
	public int dequeue() throws Exception {
		if(front==-1 || front>rear) {
			throw new Exception("Queue is empty");
		}
		return arr[front++];
	}
	public void traverse() throws Exception {
		if(front==-1 || front>rear) {
			throw new Exception("Queue is empty");
		}
		for(int i=front;i<=rear;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
public class Queue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayQueue ar = new ArrayQueue();
		ar.enqueue(12);
		ar.enqueue(13);
		ar.enqueue(14);
		ar.enqueue(15);
		ar.enqueue(16);
		ar.traverse();
		ar.dequeue();
		ar.traverse();
	}

}
