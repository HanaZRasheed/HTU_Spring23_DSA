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
			System.out.println(" NewNode address "+ newNode);
			head=newNode;
			System.out.println(" head address "+ head);
		}else {
			Node iterator=head;
			while(iterator.next!=null) {
				iterator=iterator.next;
			}
			iterator.next=newNode;
		//	System.out.println(iterator.next);
		}
	}
}
