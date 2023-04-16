package ds;

public class StackUsingLinkedList {
	private Node top;
	
	private class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
		}
	}
	
	public void push(int data) {
		Node newNode=new Node(data);
		if(top==null) {
			top=newNode;
		}else {
			newNode.next=top;
			top=newNode;
		}
	}
	
	public void pop() {
		Node oldTop=top;
		top=top.next; // oldTop.next
		oldTop=null;
	}
	
	public int top() {
		return top.data;
	}
	
	public boolean isEmpty() {
		return top==null;
	}
	
	public void print() {
		Node iterator=top;
		while(iterator!=null) {
			System.out.print(iterator.data+ " ");
			iterator=iterator.next;
		}
		System.out.println();
	}
}
