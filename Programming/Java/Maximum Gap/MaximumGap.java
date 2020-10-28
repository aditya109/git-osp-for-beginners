import java.util.*;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.println("Size of array");
		int n=s.nextInt();
		if(n<2){
		    System.out.println("Output: "+0);
		    System.exit(0);
		}
		int[] arr=new int[n];
		int[] diff_arr=new int[n]; 
		int max_diff=Integer.MIN_VALUE;
	    System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++){
		    if(s.hasNextInt())
		       arr[i]=s.nextInt();
		    }
	    QuickSort q=new QuickSort();
	    q.sort(arr,0,n-1);
	    for(int i=0;i<n-1;i++){
	        diff_arr[i]=arr[n-i-1]-arr[n-i-2];
	        if(diff_arr[i]>max_diff){
	            max_diff=diff_arr[i];
	        }
	        }
	          
	  System.out.println("Output: "+max_diff);   
	    
	}	    
 static class QuickSort 
{ 
    
    int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1); 
        for (int j=low; j<high; j++) 
        { 
          
            if (arr[j] <= pivot) 
            { 
                i++; 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
        int temp = arr[i+1]; 
	    arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
  
  
    void sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            
            int pi = partition(arr, low, high); 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 
	    
	    
	}	    
}

