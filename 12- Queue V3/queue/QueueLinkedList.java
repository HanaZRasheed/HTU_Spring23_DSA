package queue;

public class QueueLinkedList {
	private Node front, rear;
	private class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
		}
	}

	public QueueLinkedList() {
		front = null;
		rear = null;
	}

	boolean isEmpty() {
		if (rear == null && front == null) {
			return true;
		} else {
			return false;
		}
	}

	void enqueue(int data) {
		Node newNode = new Node(data);
		if (rear == null) {
			front = newNode;
			rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
	}

	void dequeue() {
		if (isEmpty()) {
			throw new IllegalAccessError();
		} else {
		front = front.next;
		if (front == null) {
			rear = null;
		}
		}
	}
	public void print() {
		Node iterator = front;
		while (iterator != null) {
			System.out.print(iterator.data + " ");
			iterator = iterator.next;
		}
		System.out.println();
	}
	
	public int front() {
		if(front==null)
			throw new IllegalAccessError();
		else
		return front.data;
	}
}
