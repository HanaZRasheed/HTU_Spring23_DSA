
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
	
	public int count() {
		return end+1;
	}
	
	
	public void print() {
		for(int i=0;i<=end;i++) {
			System.out.print(arr[i] +" ");
		}
	}
	

}
