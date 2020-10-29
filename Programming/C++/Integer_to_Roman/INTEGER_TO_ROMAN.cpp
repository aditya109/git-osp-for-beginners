// C++ Program to convert decimal number  to
// roman numerals
#include <bits/stdc++.h>
using namespace std;

// Function to convert decimal to Roman Numerals
int printRoman(int number)
{
	int num[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
	string sym[] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
	int i=12; 
	while(number>0)
	{
	int div = number/num[i];
	number = number%num[i];
	while(div--)
	{
		cout<<sym[i];
	}
	i--;
	}
}


int main()
{
	int n ;
        cin >> n;
         // enter your number to be converted .

	printRoman(n);

	return 0;
}
