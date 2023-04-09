package ds.linkedlist;

public class TestLinkedList {
public static void main(String[] args) {
	MyLinkedList linked=new MyLinkedList();
	linked.insert(10);
	linked.insert(20);
	linked.print();
	linked.insertAtPosition(30, 0);
	linked.print();
}
}
