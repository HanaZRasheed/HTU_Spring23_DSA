package ds.queue;

public class TestMyQueue {

	public static void main(String[] args) {
		MyQueue queue=new MyQueue();
		System.out.println(queue.isEmpty());
		queue.enqueue(5);
		queue.print();
		System.out.println(queue.isEmpty());
		queue.enqueue(6);
		queue.print();
		System.out.println(queue.isEmpty());
		queue.enqueue(7);
		queue.print();
		System.out.println(queue.isEmpty());
		queue.dequeue();
		queue.print();
		queue.dequeue();
		queue.print();
		queue.dequeue();
		queue.print();
		System.out.println(queue.isEmpty());
		

	}

}
