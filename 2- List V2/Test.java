package ds;

public class Test {

	public static void main(String[] args) {
	MyList list=new MyList();
	
	list.insert(5);
	list.print();
	list.insert(10);
	list.print();
	list.insert(20);
	list.print();

	list.insert(30);
	list.print();
	list.insert(40);
	list.print();
	
	list.insert(50,3);
	list.print();
	list.insert(1000,2);
	list.print();
	list.insert(300);
	list.print();
	System.out.println(list.size());
	System.out.println("after removal");
	list.remove(7);
	list.print();
	System.out.println(list.size());
	list.modifyAt(3, 770);
	list.print();
	System.out.println(list.size());
	System.out.println(list.readElement(3));
	}

}
