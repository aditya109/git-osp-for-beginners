#include <iostream>
using namespace std;
//Insertion sort
int main(){
    
    int n,comp=0,swap=0;
    cout<<"Enter the no. of elements: ";
    cin>>n;


int arr[n];
  cout<<"Enter the unsorted array: ";
 for(int i=0;i<n;i++){
     cin>>arr[i];
 }

for(int i=1;i<n;i++){
    int current=arr[i];
    int j=i-1;
    while(arr[j]>current && j>=0){
        arr[j+1]=arr[j];
        j--;
        comp++;
    }
  arr[j+1]=current;
  swap++;
}

 cout<<"Yor sorted array: [";
 for(int i=0;i<n;i++){
     cout<<arr[i]<<" ";
 }
  cout<<"]";



}
