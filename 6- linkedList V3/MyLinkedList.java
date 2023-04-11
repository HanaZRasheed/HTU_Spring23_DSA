package ds.linkedlist;

public class MyLinkedList {

	private Node head ;
	private class Node{
		// 1- store the data 
		int data;
		// 2- 
		Node next;
		
		Node(int data){
			this.data=data;
		}
	}
	
	
	public void insert(int data) {
		Node newNode=new Node(data);
		if(head==null) {
		//	System.out.println(" NewNode address "+ newNode);
			head=newNode;
		// 	System.out.println(" head address "+ head);
		}else {
			Node iterator=head;
			while(iterator.next!=null) {
				iterator=iterator.next;
			}
			iterator.next=newNode;
		//	System.out.println(iterator.next);
		}
	}
	
	public void insertAtPosition(int data,int pos) {
		Node newNode=new Node(data);
		if(pos==0) {
			newNode.next=head;
			head=newNode;
		} else {
			Node iterator=head;
			for(int i=1; i<pos;i++) {
				iterator=iterator.next;
			}
			newNode.next=iterator.next;
			iterator.next=newNode;
		}
	}
	
	public void print() {
		Node iterator=head;
		while(iterator!=null) {
			System.out.print(iterator.data+ " ");
			iterator=iterator.next;
		}
		System.out.println();
	}
	
	public void removeAt(int pos) {
		if(pos==0) {
			Node oldHead=head;
			head=head.next;
			oldHead.next=null;
			System.out.println("The address of new head is "+ head);
			System.out.println("The value of new head is "+ head.data);
		}else {
			Node iterator=head;
			for(int i=1; i<pos;i++) {
				iterator=iterator.next;
			}
			Node oldNode=iterator.next;
			iterator.next=iterator.next.next; // oldNode.next
			oldNode.next=null;
		}
	}
}
