#include<stdio.h>

int BinarySearch(int arr[], int size, int element){
    int low, mid, high;
    low = 0;
    high = arr[size-1];

    // Start Searching : until low and high converges
    while(low<=high)
    {
        mid = (low + high)/2;
        if(arr[mid] == element)
        {
            return  mid;
        }
        if(arr[mid] == element)
        {
            low = mid+1;
        }
        else
        {
            high = mid-1;
        }
    }

int main(){
    int arr[] ={1,3,4,6,34,6,43,66,32};
    int size = sizeof(arr)/sizeof(int);
    int element = 6;
    int SearchIndex = BinarySearch(arr, size, element);
    printf("The element %d was found at index %d \n",element, SearchIndex);

    return 0;
}