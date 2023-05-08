package queue;

public class Main {
	public static void main(String[] args) {
		QueueLinkedList q = new QueueLinkedList();		
		System.out.println(q.isEmpty());
		q.enqueue(5);
		System.out.println(q.isEmpty());
		q.dequeue();
		System.out.println(q.isEmpty());
		//q.dequeue();
		//System.out.println(q.isEmpty());
		q.enqueue(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(40);
		q.enqueue(80);
		q.print();
		q.dequeue();
		q.dequeue();
		q.print();
		System.out.println(q.front());
	}
}
