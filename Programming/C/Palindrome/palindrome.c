#include<stdio.h>  // header file for input and output
 
 int palindrome(int n){
   int temp=n;   // temp variable to store entered value
   int change=0;

   if(n<0){
    return 0;
   }
   while(n>0){

    change =(change*10)+(n%10);      // change is to store reverse value
     n=n/10;
   }
   return (change==temp);      // checking the value you entered is same as reverse value if true then return 1
 }
int main(){
  int x;      // Number you want to check
  scanf("%d",&x);

  int result= palindrome(x);   // function to check for palindrome return true or false

  if(result==0){             // checking return value from palindrome function
    printf("false");         // false means not a palindrome
  }
  else
    printf("true");    // true means is a palindrome


 return 0;
}
