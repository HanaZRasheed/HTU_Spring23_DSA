package practice2;

public class MyStack2 <T> {
	private int top;
	private T[] array;
	private 
	int size;
	
	public MyStack2() {
		top=-1;
		size=10;
		array=(T[]) new Object[size];
	}
	
	public void push(T element) {
		if(isFull()) {
			throw new StackOverflowError();
			/*
			 * size=size*2; int []b=new int[size]; for(int i=0;i<array.length;i++) {
			 * b[i]=array[i]; } array=b;
			 */
		}
		else {
		top++;
		// array[++top]=element;
		array[top]=element;
		}
	}
	
	public void pop() {
		if(isEmpty()) {
			throw new IllegalAccessError();
		}
		else {
		top--;
		}
	}
	
	public T top() {
		if(isEmpty()) {
			throw new IllegalAccessError();
		}else {
		return array[top];
		}
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
