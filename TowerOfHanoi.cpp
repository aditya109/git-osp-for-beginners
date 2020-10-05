#include<bits/stdc++.h>
using namespace std;

void TowerOfHanoi(int n,char from,char to,char auxilary_rod)
{
	if(n==1)
	{
		cout<<"Take the disk1 from rod "<<from<<" to rod "<<to<<"\n";
		return;
	}
	TowerOfHanoi(n-1,from,auxilary_rod,to);
	cout<<"Take the disk"<<n<<" from rod "<<from<<" to rod "<<to<<"\n";
	TowerOfHanoi(n-1,auxilary_rod,to,from);
}


int main()
{
	int n;
	cout<<"Enter the number of disks "<<"\n";
	cin>>n;
	cout<<"\n";
	TowerOfHanoi(n,'A','B','C');
	return 0;
}
