package ds.queue;

public class MyQueueV2 {
	private int [] array;
	private int front;
	private int rear;
	private int size;
	
	MyQueueV2(){
		size=5;
		front=rear=-1;
		array=new int[size];
	}

	public boolean isEmpty() {
		return front==-1 & rear==-1;
	}
	
	public void enqueue (int data) {
		if(isEmpty()) {
			rear++;
			front++;
		}else if(((rear+1)%size) == front) {
			System.out.println("the array is full, the front index is " + front);
			throw new IllegalAccessError();
		} else {
			rear=rear+1%size;
		}
		array[rear]=data;
		}
	
	
	public void dequeue() {
		if(isEmpty()) {
			throw new IllegalAccessError();
		} else if (front==rear && rear !=-1 ) {
			front=rear=-1;
		} else {
			front=(front+1)%size;
		}
	}
	

	public int front() {
		if(isEmpty()) {
			throw new IllegalAccessError();
		}else {
			return array[front];
		}
	}
}


