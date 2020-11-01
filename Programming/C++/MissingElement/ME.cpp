#include<bits/stdc++.h>
using namespace std;

int search_missing_element(long long int arr[],long long int low ,long long int high){
    long long int mid;
    mid=(high+low)/2;
    // cout<<mid<<" ";
    
    if (mid==arr[mid-1] && mid+1!=arr[mid])
        return mid+1;
    else if (mid==high && mid==arr[mid-1])
        return mid+1;
    else if (mid==low && mid!=arr[mid-1])
        return mid; 

    if (mid<arr[mid-1]){
        // cout<<"left"<<endl;
        search_missing_element(arr,low,mid-1);
    }
    else {
        search_missing_element(arr,mid+1,high);
        // cout<<"right"<<endl;
    }
}

int main(){
    int T;
    cin>>T;
    for ( int t=0;t<T;t++){
        long long int n,i,MissingElement;
        cin>>n;
        long long int arr[n-1];
        for(i=0;i<n-1;i++){
            cin>>arr[i];  
        }
        
        sort(arr,arr+n-1);
        MissingElement=search_missing_element(arr,1,n-1);
        
        cout<<MissingElement<<endl;
    }
    return 0;
}