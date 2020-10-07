#include <iostream>

using namespace std;

bool checkPrime(int n) {
   if(n<=1){
      return false;
   }
   int i;
   for(i = 2; i*i <= n; i++) {   // O(sqrt(n))
      if (n%i == 0)
      {
         return false;
      }
   }
   return true;
}

int main() {
   int input;
   cout<<"Enter a number:";
   cin>>input;
   
   if(checkPrime(input)){
      cout<<"Prime Number";
   }
   else{
      cout<<"Not Prime";
   }

   return 0;
}