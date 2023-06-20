package Ds;
//file name : Sack
class ArrayStack{
	static final int max_cap = 5;
	int arr[] = new int[max_cap];
	int top;
	ArrayStack(){
		top=-1;
	}
	void push(int val) throws Exception {
		if(top==max_cap-1) {
			throw new Exception("Stack overflow");
			//System.out.println("stack overflow");
		}
		arr[++top]=val;
	}
	int pop() throws Exception {
		if(top==-1) {
			throw new Exception("Stack underflow");
//			System.out.println("Stack underflow");
		}
		return arr[top--];
	}
	int peek() throws Exception {
		if(top==-1) {
			throw new Exception("under underflow");
			//System.out.println("stack underflow");
		}
		return arr[top];
	}
	boolean isEmpty() {
		return top==-1;
		}
	void traverse() {
		for(int i=0;i<=top;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
} 





public class Stack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayStack as = new ArrayStack();
		as.push(10);
		as.push(20);
		as.push(30);
		as.push(40);
		as.push(50);
		as.traverse();
		as.push(60);
		as.peek();
		
	}

}
