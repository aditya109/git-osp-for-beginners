#include<bits/stdc++.h>
using namespace std;

// function to check number is prime or not..
 bool IsPrime(int n) { 
	if(n<2) return false; // if number is less than 2 then it will not prime 
	
	for(int i = 2; i<=sqrt(n); i++)  //loop to check number is prime or not
	{
			if(n%i==0) return false; // we will check if number is divisible by any number from 2 to n/2+1, then it will not prime
	}
	return true;
}

int main() {
	
	int size = 20;
	int arr[size];
	
	for(int i=0; i<size; i++) cin>>arr[i]; 
	
	for(int i=0; i<size; i++)
		{
			if(IsPrime(arr[i]) == true) 
				{
					cout<<arr[i]<<" "; // print the prime numbers..
				}
		}
	return 0;	
 }
