/*Issue #309 Finding maximum difference between two successive elements of a sorted array*/
#include <iostream>
#include<stdlib.h>
using namespace std;

//Function for sorting
void insertionSort(int arr[], int n)
{
    int i, key, j;
    for(i=1;i<n;i++)
    {
        key=arr[i];
        j=i-1;

        while(j>=0 && arr[j]>key)
        {
            arr[j+1]=arr[j];
            j=j-1;
        }
        arr[j+1]=key;
    }
}
//Function to find maximum difference
int maxDiff(int arr[], int n)
{
    int tempDiff;
    int maxDiff=arr[1]-arr[0];
    int i;
    for(i=2; i<n; i++)
    {
        tempDiff=arr[i]-arr[i-1];
        if(tempDiff>maxDiff)
        {
            maxDiff=tempDiff;
        }
    }
    return maxDiff;
}
int main()
{
    int i,n, maxD=0;
    cout<<"\nEnter size of the array (must be greater than 2): ";
    cin>>n;
    int *arr=new int[n];
    cout<<"\nEnter the elements of the array\n";
    for(i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    insertionSort(arr,n);
    maxD=maxDiff(arr, n);
    cout<<"\nMaximum Difference is "<<maxD<<endl;
    return 0;
}
