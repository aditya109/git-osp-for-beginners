package Sorting;

/*
	Quicksort is a sorting algorithm, which is leveraging the divide-and-conquer principle. 
	It has an average O(n log n) complexity and it’s one of the most used sorting algorithms, 
	especially for big data volumes.
	
*/	

public class QuickSort {
/* 
	function that consider last element as pivot, place the pivot at its exact 
	position, and place smaller elements to left of pivot and greater elements 
	to right of pivot.  
*/  
	int partition (int a[], int start, int end)  
	{  
		int pivot = a[end]; // pivot element  
		int i = (start - 1);  

		for (int j = start; j <= end - 1; j++)  
		{  
			// If current element is smaller than the pivot  
			if (a[j] < pivot)  
			{  
				i++; // increment index of smaller element  
				int t = a[i];  
				a[i] = a[j];  
				a[j] = t;  
			}  
		}  
		int t = a[i+1];  
		a[i+1] = a[end];  
		a[end] = t;  
		return (i + 1);  
	}  

	// function to implement quick sort   
	void quick(int a[], int start, int end) // a[] = array to be sorted, start = Starting index, end = Ending index  
	{  
		if (start < end)  
		{  
			int p = partition(a, start, end);  //p is partitioning index  
			quick(a, start, p - 1);  
			quick(a, p + 1, end);  
		}  
	}  

	// function to print an array  
	void printArray(int a[], int n)  
	{  
		int i;  
		for (i = 0; i < n; i++)  
			System.out.print(a[i] + " ");  
	}  
	public static void main(String[] args) {  
		int a[] = { 13, 18, 27, 2, 19, 25, 1, 23 };  
		int n = a.length;  
		System.out.println("Before Sorting the Array: ");  
		QuickSort sort = new QuickSort();  
		sort.printArray(a, n);  
		sort.quick(a, 0, n - 1);  
		System.out.println("\nAfter Quick Sorting the Array:");  
		sort.printArray(a, n);  
	}  
}
