#include<bits/stdc++.h>
using namespace std;
int main(){
    string cardno;
    cout<<"Enter the credit card number that you want to check:";
    cin>>cardno;
    int odd=0;
    int even=0;
    if(cardno.length()%2==0){
        for(int i=cardno.length()-2;i>=0;i=i-2){
            int add=(cardno[i]-48)*2;
            if(add>9){
                int sum=0;
                while (add != 0){
                    sum = sum + add % 10;
                    add = add / 10;
                }
                add=sum;
            }
            even=even+add;
        }
        for(int i=cardno.length()-1;i>=1;i=i-2){
            int add=cardno[i]-48;
            odd=odd+add;
        }
    }
    else{
        for(int i=cardno.length()-2;i>=1;i=i-2){
            int add=(cardno[i]-48)*2;
            if(add>9){
                int sum=0;
                while (add != 0){
                    sum = sum + add % 10;
                    add = add / 10;
                }
                add=sum;
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