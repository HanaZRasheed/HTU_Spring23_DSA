

public class Test2 {

	public static void main(String[] args) {
		ListClass myList=new ListClass();
		System.out.println(myList.isEmpty());
		myList.insertItem(10);
		myList.insertItem(20);
		myList.insertItem(30);
		System.out.println("The list status"+ myList.isEmpty());
		System.out.println("The list size "+ myList.count());
		myList.print();

	}

}
