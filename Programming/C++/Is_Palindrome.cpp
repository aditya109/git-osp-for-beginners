//Palindrome Number

#include<iostream>
using namespace std;


int palindrome(int x){
   int reverse=0,rem;
   int original=x;
   while(x){
      rem=x%10;
      reverse=reverse*10+rem;
      x/=10;
   }
    
   if(reverse==original)
      return 1;
    return 0; 
}






int main(){
    int x;
    cout<<"Enter Number: ";
    cin>>x;
    if(palindrome(x))
      cout<<"\nNumber is Palindrome";
    else
      cout<<"\nNumber is Not Palindrome";
    return 0;  
      
}
