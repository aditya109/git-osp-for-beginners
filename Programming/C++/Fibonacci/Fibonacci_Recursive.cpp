#include<bits/stdc++.h> 
using namespace std; 
  
int fibonacci(int n) 
{ 
    if (n <= 1) 
        return n; 
    return fib(n-1) + fib(n-2); 
} 
  
int main () 
{ 
    int n = 9; 
    cout << fibonacci(n); 
    getchar(); 
    return 0; 
} 