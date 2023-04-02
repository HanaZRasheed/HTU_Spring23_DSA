package ds;

public class ListClass {
	// attributes
	int maxsize=10;
	int [] arr;
	int end;
	
	// constructor
	public ListClass() {
		arr=new int[maxsize];
		end=-1;	
	}
	
	public boolean isEmpty() {
		if(end==-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public void insertItem(int item) {
		end++;
		arr[end]=item;
	}
	
	public void insertItem(int item,int pos) {
		end++;
		for(int i=end;i>pos;i--) {
			arr[i]=arr[i-1];
		}
		arr[pos]=item;
	}
	
	public int count() {
		return end+1;
	}
	
	
	public void print() {
		for(int i=0;i<=end;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
	
	public void remove(int pos) {
		for(int i=pos;i<end;i++) {
			arr[i]=arr[i+1];
		}
		arr[end]=0;
		end--;
	}
	
	public int readElementAtPosition(int pos) {
		return arr[pos];
	}
	
	public void modifyElement(int pos, int newValue) {
		arr[pos]=newValue;
	}

}
