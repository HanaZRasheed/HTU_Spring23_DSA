

public class Sorting {
    public static void selectionSort(int arr[]){
        //write your code here
    }
    
    public static void mergeSort(int arr[]){
        //write your code here
    }
    
    public static void generateArray(int arr[],int size,int flag){
        //flag = 1 means sorted
        //flag = 0 means reversely sorted
        if(flag == 1){
          for(int i=0;i<size;i++)
              arr[i]=i;
        }else{
            for(int i=size;i>0;i--)
              arr[size-i]=i;  
        } 
    }
    
    public static void main(String[] args) {
        int arr5000Sorted[]=new int[5000];
        generateArray(arr5000Sorted, 5000, 1);
        int arr5000Unsorted[]=new int[5000];
        generateArray(arr5000Unsorted, 5000, 0);
        
        int arr50000Sorted[]=new int[50000];
        generateArray(arr50000Sorted, 50000, 1);
        int arr50000Unsorted[]=new int[50000];
        generateArray(arr50000Unsorted, 50000, 0);
        
        int arr500000Sorted[]=new int[500000];
        generateArray(arr500000Sorted, 500000, 1);
        int arr500000Unsorted[]=new int[500000];
        generateArray(arr500000Unsorted, 500000, 0);
      
        
        
        
        ////////////////////////////////////////////////
        ////////////    Selection Sort      ////////////
        ////////////////////////////////////////////////
        System.out.println("******************************************************");
        System.out.println("**************Time to run Selection Sort**************");
        System.out.println("******************************************************");
        //time to sort array 5000 sorted using selection
        long startTime = System.nanoTime();
          selectionSort(arr5000Sorted);        
        long elapsedTime = System.nanoTime() - startTime;
     
        System.out.println("Time to sort array 5000 sorted using selection sort in millis: "
                + elapsedTime/1000000);
      
        //time to sort array 5000 unsorted using selection
        startTime = System.nanoTime();
          selectionSort(arr5000Unsorted);        
        elapsedTime = System.nanoTime() - startTime;
     
        System.out.println("Time to sort array 5000 unsorted using selection sort in millis: "
                + elapsedTime/1000000);
       
        //time to sort array 50000 sorted using selection
        startTime = System.nanoTime();
          selectionSort(arr50000Sorted);        
        elapsedTime = System.nanoTime() - startTime;
     
        System.out.println("Time to sort array 50000 sorted using selection sort in millis: "
                + elapsedTime/1000000);
      
        //time to sort array 50000 unsorted using selection
        startTime = System.nanoTime();
          selectionSort(arr50000Unsorted);        
        elapsedTime = System.nanoTime() - startTime;
     
        System.out.println("Time to sort array 50000 unsorted using selection sort in millis: "
                + elapsedTime/1000000);
       
        
        //time to sort array 500000 sorted using selection
        startTime = System.nanoTime();
          selectionSort(arr500000Sorted);        
        elapsedTime = System.nanoTime() - startTime;
     
        System.out.println("Time to sort array 500000 sorted using selection sort in millis: "
                + elapsedTime/1000000);
      
        //time to sort array 500000 unsorted using selection
        startTime = System.nanoTime();
          selectionSort(arr500000Unsorted);        
        elapsedTime = System.nanoTime() - startTime;
     
        System.out.println("Time to sort array 500000 unsorted using selection sort in millis: "
                + elapsedTime/1000000);
       
        
        
        
        ////////////////////////////////////////////////
        ////////////        Merge Sort      ////////////
        ////////////////////////////////////////////////
        
        System.out.println("******************************************************");
        System.out.println("**************Time to run Merge Sort**************");
        System.out.println("******************************************************");
        
        //time to sort array 5000 sorted using merge 
        startTime = System.nanoTime();
          mergeSort(arr5000Sorted);        
        elapsedTime = System.nanoTime() - startTime;
     
        System.out.println("Time to sort array 5000 sorted using merge sort in millis: "
                + elapsedTime/1000000);
      
        //time to sort array 5000 unsorted using merge
        startTime = System.nanoTime();
          mergeSort(arr5000Unsorted);        
        elapsedTime = System.nanoTime() - startTime;
     
        System.out.println("Time to sort array 5000 unsorted using merge sort in millis: "
                + elapsedTime/1000000);
       
        //time to sort array 50000 sorted using merge
        startTime = System.nanoTime();
          mergeSort(arr50000Sorted);        
        elapsedTime = System.nanoTime() - startTime;
     
        System.out.println("Time to sort array 50000 sorted using merge sort in millis: "
                + elapsedTime/1000000);
      
        //time to sort array 50000 unsorted using merge
        startTime = System.nanoTime();
          mergeSort(arr50000Unsorted);        
        elapsedTime = System.nanoTime() - startTime;
     
        System.out.println("Time to sort array 50000 unsorted using merge sort in millis: "
                + elapsedTime/1000000);
       
        
        //time to sort array 500000 sorted using merge
        startTime = System.nanoTime();
          mergeSort(arr500000Sorted);        
        elapsedTime = System.nanoTime() - startTime;
     
        System.out.println("Time to sort array 500000 sorted using merge sort in millis: "
                + elapsedTime/1000000);
      
        //time to sort array 500000 unsorted using merge
        startTime = System.nanoTime();
          mergeSort(arr500000Unsorted);        
        elapsedTime = System.nanoTime() - startTime;
     
        System.out.println("Time to sort array 500000 unsorted using merge in millis: "
                + elapsedTime/1000000);
       
        
        
    }
}