package practice2;

public class MyStack {
	private int top;
	private int[] array;
	private int size;
	
	public MyStack() {
		top=-1;
		size=10;
		array=new int[size];
	}
	
	public void push(int element) {
		if(isFull()) {
			//throw new StackOverflowError();
			size=size*2;
			int []b=new int[size];
			for(int i=0;i<array.length;i++) {
				b[i]=array[i];
			}
			array=b;
		}
		else {
		top++;
		// array[++top]=element;
		array[top]=element;
		}
	}
	
	public void pop() {
		top--;
	}
	
	public int top() {
		return array[top];
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public boolean isFull() {
		return top==array.length-1;
	}

	public void print() {
		for(int i=0; i<=top;i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
	}
}
