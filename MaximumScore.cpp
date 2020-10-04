#include<bits/stdc++.h>
using namespace std;
int main()
{
	int A[11];
	string s[11];
	int n=11;
	cout<<"Enter the name and corresponding score:"<<"\n";
	for(int i=0;i<n;i++)
	{
		cin>>s[i];
		cin>>A[i];
	}
	int max=A[0],j;
	for(int i=0;i<n;i++)
	{
		if(A[i]>max)
		{
			 j=i;
			max=A[i];
		}
	}
	cout<<"The maximum score of: "<<max<<" is scored by "<<s[j];
}
