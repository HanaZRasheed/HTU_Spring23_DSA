package practice2;

public class TestStack {

	public static void main(String[] args) {
		MyStack stack=new MyStack();
		System.out.println(stack.isEmpty());
		stack.push(5);
		stack.print();
		stack.push(7);
		stack.print();
		stack.push(3);
		stack.print();
		stack.pop();
		stack.print();
		stack.push(6);
		stack.push(9);
		stack.push(8);
		stack.push(10);
		stack.push(11);
		stack.push(12);
		stack.print();
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.top());
		

	}

}
