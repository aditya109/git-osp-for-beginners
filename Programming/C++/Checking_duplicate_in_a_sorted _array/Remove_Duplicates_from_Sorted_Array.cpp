 #include<bits/stdc++.h>
using namespace std;
  
 
int main()
{
     int n;
     cin>>n;
     //size of array

    int arr[n];
    //Take input of a sorted array 

    for(int i=0;i<n;i++)
        cin>>arr[i];

    int cnt=1;
    // bcz arr[0] is always in output array

    for(int i=1;i<n;i++)
    {
        // arr[i]==arr[i-1] then arr[i] is a duplicate
        
        if(arr[i]!=arr[i-1])
        {
            arr[cnt]=arr[i];
            cnt++;
        }

    }

    cout<<cnt<<endl;

    for(int i=0;i<cnt;i++)
    {
        cout<<arr[i]<<" ";
    }
 
    return 0 ;
}

/*

Sample test case:-

input:
8
-1 -1 2 3 3 3 5 7

output:
5
-1 2 3 5 7

*/