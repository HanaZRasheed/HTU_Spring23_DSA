package ds;

public class Test3 {

	public static void main(String[] args) {
		ListClassV3 myList=new ListClassV3();
		System.out.println(myList.isEmpty());
		myList.insertItem(10);
		myList.insertItem(20);
		myList.insertItem(30);
		System.out.println("The list status"+ myList.isEmpty());
		System.out.println("The list size "+ myList.count());
		myList.print();
		myList.insertItem(100, 1);
		System.out.println("after insertion");
		System.out.println("The list size "+ myList.count());
		myList.print();
		myList.remove(1);

		myList.print();
		int el=myList.readElementAtPosition(1);
		System.out.println("element at position 1 is "+ el);
		myList.modifyElement(1,200);
		
		int el2=myList.readElementAtPosition(1);
		System.out.println("element at position 1 is "+ el2);
		myList.print();
		myList.insertItem(2);
		myList.insertItem(4);
		myList.print();
		myList.insertItem(40);
		
	}

}
