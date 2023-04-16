package ds;

public class TestStackUsingLinkedList {

	public static void main(String[] args) {
		StackUsingLinkedList stack=new StackUsingLinkedList();
		System.out.println(stack.isEmpty());
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		int topEl=stack.top();
		System.out.println(topEl);
		stack.print();
		stack.pop();
		stack.print();
		stack.pop();
		stack.print();
		System.out.println(stack.isEmpty());
		

	}

}
