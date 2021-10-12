package Sorting;

/*
 Heap sort processes the elements by creating the min heap or max heap using 
 the elements of the given array. Min heap or max heap represents the ordering 
 of the array in which root element represents the minimum or maximum element 
 of the array. At each step, the root element of the heap gets deleted & stored 
 into the sorted array and the heap will again be heapified.

  The heap sort basically recursively performs two main operations.
  	* Build a heap H, using the elements of ARR.
  	* Repeatedly delete the root element of the heap formed in phase 1.
  	
 */

public class HeapSort {
	public void heapSort(int arr[])
	{
		int temp;
		//build the heap
		for (int i = arr.length / 2 - 1; i >= 0; i--)                
		{
			heapify(arr, arr.length, i);
		}
		//extract elements from the heap
		for (int i = arr.length - 1; i > 0; i--)                            
		{
			//move current root to end (since it is the largest)
			temp = arr[0];                                                  
			arr[0] = arr[i];
			arr[i] = temp;
			//recall heapify to rebuild heap for the remaining elements
			heapify(arr, i, 0);                                             
		}
	}

	void heapify(int arr[], int n, int i)
	{
		int MAX = i; // Initialize largest as root
		int left = 2 * i + 1; //index of the left child of ith node = 2*i + 1
		int right = 2 * i + 2; //index of the right child of ith node  = 2*i + 2
		int temp;

		//check if the left child of the root is larger than the root
		if (left < n && arr[left] > arr[MAX])            
		{
			MAX = left;
		}
		//check if the right child of the root is larger than the root
		if (right < n && arr[right] > arr[MAX])            
		{
			MAX = right;
		}
		//repeat the procedure for finding the largest element in the heap
		if (MAX != i) 
		{                                               
			temp = arr[i];
			arr[i] = arr[MAX];
			arr[MAX] = temp;
			heapify(arr, n, MAX);
		}
	}

	//display the array
	void display(int arr[])                 
	{  
		for (int i=0; i<arr.length; ++i) 
		{
			System.out.print(arr[i]+" ");
		} 
	} 

	public static void main(String args[])
	{
		int arr[] = { 12, 33, 52, 1, 12, 9 , 3, 10, 15 };

		HeapSort sort = new HeapSort();
		sort.heapSort(arr);
		sort.display(arr);
	}
}
