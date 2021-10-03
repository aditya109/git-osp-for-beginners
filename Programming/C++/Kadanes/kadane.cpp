#include<bits/stdc++.h>
using namespace std;

int main(){
    long long int T;
    cin>>T;
    for (long long int t=0;t<T;t++)
    {
        long long int n,max_sum,sum;
        bool NeagativeElements;
        cin>>n;
        long long int arr[n];
        NeagativeElements=true;
        for (long long int i=0;i<n;i++)
        {
            cin>>arr[i];
            if(arr[i]>0)
                NeagativeElements=false;
        }
        // All the elements are negative
        if(NeagativeElements){
            sum=arr[0];
            for(long long int i=i;i<n;i++){
                if (arr[i]>sum)
                    sum=arr[i];
            }  

            cout<<sum<<endl;
        }
        // Aleast one poitive element , sum is a positive number 
        else {
            max_sum=0;
            sum=0;
            for ( long long int i=0;i<n;i++){
                sum=sum+arr[i];
                if(sum>max_sum)
                    max_sum=sum;
                
                if(sum<0)
                    sum=0;
            }

            cout<<max_sum<<endl;
        }
    }
    return 0;
}