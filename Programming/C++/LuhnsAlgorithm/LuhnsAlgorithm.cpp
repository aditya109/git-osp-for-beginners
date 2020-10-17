#include<bits/stdc++.h>
using namespace std;
int addDigits(int add){
    int sum=0;
    while (add != 0){
    sum = sum + add % 10;
    add = add / 10;
    }
    return sum;
}
int main(){
    string cardno;
    cout<<"Enter the credit card number that you want to check:";
    cin>>cardno;//Taking the credit card number as a String so individual digits can be accessed easily.
    int odd=0;
    int even=0;
    if(cardno.length()%2==0){//If the number of digits is even
        for(int i=cardno.length()-2;i>=0;i=i-2){
            int add=(cardno[i]-48)*2;//48 is the ASCII code of '0' It is necessary to get the real value of the digit as what we have got is the character
                                     //of the digits which has to be converted to real numerical values. So subtracting 48 from it will do the trick.
                                     //Here (cardno[i]-48)*2 is done to check for the even indices sum so as to add to the checksum.
            if(add>9){  //Adding individual digits if (cardno[i]-48)*2 is more than 9 that is 2 digit number
                add=addDigits(add);
            }
            even=even+add;
        }
        for(int i=cardno.length()-1;i>=1;i=i-2){
            int add=cardno[i]-48;
            odd=odd+add;
        }
    }
    else{//If the number of digits is odd
        for(int i=cardno.length()-2;i>=1;i=i-2){
            int add=(cardno[i]-48)*2;
            if(add>9){
                add=addDigits(add);
            }
            even=even+add;
        }
        for(int i=cardno.length()-1;i>=0;i=i-2){
            int add=cardno[i]-48;
            odd=(int)odd+add;
        }
    }
    int checksum=even+odd; 
    if(checksum%10==0){
        cout<<"The number is valid"<<endl;
    }
    else{
        cout<<"The number is invalid"<<endl;
    }
    return 0;
}
