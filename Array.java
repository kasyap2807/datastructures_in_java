package Ds;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
				Scanner sc =new Scanner(System.in);
				int var;
				int pos;
				DynamicArray list = new DynamicArray();
				while(true) {
					System.out.println("-----------------list menu------------------");
					System.out.println("1.insert at end");
					System.out.println("2. display the list");
					System.out.println("3.inserta at specific pos");
					System.out.println("4.delete the specific pos");
					System.out.println("5.delete at end");
					System.out.println("6.delete at beginig");
					System.out.println("7.insert at begining");
					System.out.println("8.get value by index");
					System.out.println("9.update by index and new value");
					System.out.println("10.search element using value");
					System.out.println("11.to check weather elemnt present in list or not");
					System.out.println("12.clear the list");
					System.out.println("13.exit");
					System.out.println("select choice :");
					int ch=sc.nextInt();
					switch(ch) {
					case 1:{
						System.out.println("enter the size: ");
						var = sc.nextInt();
						list.insertAtEnd(var);
						break;
						}
					case 2:{
						list.display();
						break;
						}
					case 3:{
						System.out.println("enter the posirtion (starts from 0):");
						pos = sc.nextInt();
						if(pos<0) {
							System.out.println("invalid position");
							break;}
						System.out.println("Enter the data :");
						var = sc.nextInt();
						list.insertAtPos(pos,var);
						break;
						}
					case 4:{
						System.out.println("enter position (Starts from 0");
						pos=sc.nextInt();
						if(pos<0) {
							System.out.println("invalid position");
							break;
						}
						list.deleteAtPos(pos);
						break;
						}
					case 5:{
						list.deleteAtEnd();
						break;
					}
					case 6:{
						list.deleteAtBeg();
						break;
					}
					case 7:{
						System.out.println("enter the element");
						var=sc.nextInt();
						list.insertAtBeg(var);
						break;
					}
					case 8:{
						System.out.println("enter value");
						var = sc.nextInt();
						list.getvalues(var);
						break;
					}
					case 9:
					{
						System.out.println("enter the index to update :");
						pos=sc.nextInt();
						System.out.println("enter value:");
						var = sc.nextInt();
						list.updates(pos,var);
						break;
					}
					case 10:{
						System.out.println("enter value to search:");
						var = sc.nextInt();
						list.search(var);
						break;
//						contains;
//						clear;
					}
					case 11:{
						System.out.println("enter element to check: ");
						var = sc.nextInt();
						list.contains(var);
						break;
					}
					case 12:{
						list.clear();
						break;
					}
					case 13:{
						System.exit(0);
						break;
					}
					default:
						System.out.println("invalid choice");
					}
					System.out.print("array size is ");
					list.size();
				}
	}
	

}
class DynamicArray {
	static int initialcap =8;//static data cant change
	//univarsal variables
	int cap;
	int arr[];
	int size;
	DynamicArray(){//cpnstructor
		arr = new int[initialcap];
		size =0;
		cap = initialcap;
	}
	public void insertAtEnd(int var) {
		// TODO Auto-generated method stub
		if(size==cap){
			ExpandArray();
		}
		//else {
			arr[size++]=var;
		//}
	}
	public void ExpandArray() {
		// TODO Auto-generated method stub
		cap = cap*2;
		arr=Arrays.copyOf(arr,cap);
	}
	public void display() {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
	}
	public void insertAtPos(int pos,int var) {
		if(size==cap) {
			ExpandArray();
		}
		for(int i=size-1;i>=pos;i--) {
			arr[i+1]=arr[i];
		}
		arr[pos]=var;
		size++;
	}
	public void deleteAtPos(int pos) {
		// TODO Auto-generated method stub
		for(int i=pos+1;i<size;i++) {
			arr[i-1]=arr[i];
		}
		size--;
		if(cap>3*size && cap>initialcap) {
			shrinkArray();
		}
	}
	public void shrinkArray() {
		// TODO Auto-generated method stub
		cap = cap/2;
		arr=Arrays.copyOf(arr, cap);
	}
	public void size() {
		System.out.println(arr.length);
	}
	public void deleteAtEnd() {
		// TODO Auto-generated method stub
		size--;
	}
	public void deleteAtBeg() {
		// TODO Auto-generated method stub
		for(int i=1;i<size;i++) {
			arr[i-1]=arr[i];
		}
		size--;
		if(cap>3*size && cap>initialcap) {
			shrinkArray();
		}
	}
	public void insertAtBeg(int var) {
		// TODO Auto-generated method stub
		for(int i=size-1;i>=0;i--) {
			arr[i+1]=arr[i];
		}
		arr[0]=var;
		size++;
	}
	public void getvalues(int var) {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++) {
			if(var==arr[i]) {
				System.out.println("index is:"+i);
				break;
			}
		}
	}
	public void updates(int pos, int var) {
		// TODO Auto-generated method stub
		arr[pos]=var;
	}
	public void search(int var) {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++) {
			if(arr[i]==var) {
				System.out.println("found element at "+i+"index");
				break;
			}
		}
	}
	public void contains(int var) {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++) {
			if(arr[i]==var) {
				System.out.println(var+"contains in list");
				break;
			}
		}
	}
	public void clear() {
		// TODO Auto-generated method stub
		size=0;
	}
	//executed by Array
	
	
	
}

