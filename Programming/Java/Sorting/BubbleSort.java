/*
*   Bubble Sort is the most basic sorting Algorithm
*   Time Complexity : O(N^2)
*   Space Complexity: O(1)
*
*   Best Case : All the elements in an Array are sorted.
*   Worst Case: Array is completely
*   Bubble Sort compares digit on current position of array starting from 0 with next element in array
*       If the number is greater it swaps if the number is smaller it leaves that number as it is and
*       increases the index position of array
*   Bubble Sort Fixes one Element at a Time in an unsorted array
* 
*/

package arraysSorting;

public class BubbleSort {
    public static void main(String[] args) {

        Integer[] array = {-82, 887, 566, 9899, 25, -151, 14, 3, 8288, 10010};

        bubbleSortAscending(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\n");
        System.out.println(bubbleSortAscending(array)+"\n");        // Prints Address Of array


        bubbleSortDescending(array);
        for(int i: array){
            System.out.println(array[i]);
        }

    }

    public static Integer[] bubbleSortAscending(Integer[] a) {
        int temp = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }
    public static Integer[] bubbleSortDescending(Integer[] a) {
        Integer[] temp = {0};
        for (int j = 0; j < a.length - 1; j++) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] < a[i + 1]) {
                    temp[0] = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp[0];
                }
            }
        }
        return a;
    }

}
