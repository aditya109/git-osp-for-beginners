#include<bits/stdc++.h>
using namespace std;

// Function to rarrange the elements in O(1) extra space
void arrange(long long A[], int n1) {
    int i;
    
    // changing the array elements
    for(i=0;i<n1;i++){
        A[i]+=(A[A[i]]%n1)*n1;
    }
    
    // since we have multiplied each element with n1
    // We should divide it by n1 too to get the original element
    for(i=0;i<n1;i++){
        A[i]=A[i]/n1;
    }
}

