package practice2;

public class TestStack2 {

	public static void main(String[] args) {
		MyStack2 <Integer>stack=new MyStack2();
		System.out.println(stack.isEmpty());
		//stack.pop();
		stack.push(1);
		stack.print();
		stack.push(2);
		stack.print();
		stack.push(3);
		stack.print();
		stack.pop();
		stack.print();
		
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.top());
		

	}

}
