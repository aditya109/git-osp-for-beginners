// To calculate sum of digits of the number entered

#include<iostream>
using namespace std;

int main()
{
	int n , rem , sum = 0;
	
	cout<<"Enter the number: \n";
	cin>>n;
	
	while(n > 0)
	{
		rem = n % 10;             // extracting the last digit
		n = n / 10;               // removing the last digit
		sum = sum + rem;          // calculating sum of digits 
	}
	
	cout<<"Sum of digits of the number entered: "<<sum;
	
	return 0;
}
