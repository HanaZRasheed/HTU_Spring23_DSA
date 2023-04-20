package ds.queue;

public class TestMyQueue2 {

	public static void main(String[] args) {
		MyQueueV2 queue1=new MyQueueV2();
		queue1.enqueue(3);
		queue1.enqueue(5);
		queue1.enqueue(6);
		queue1.enqueue(7);
		queue1.enqueue(8);
		queue1.print();
		queue1.dequeue();
		queue1.print();
		queue1.dequeue();
		queue1.print();
		queue1.dequeue();
		queue1.dequeue();
		queue1.print();
		//System.out.println(queue1.isEmpty());
		int front= queue1.front();
		System.out.println("the element in the front "+ front);

	}

}
