// A program to check if a number is Armstrong number
#include<iostream>
#include<math.h>
using namespace std;

bool checkArmstrong(int n){
    int realnumber=n;
    int sum=0;
    while(n>0){
        int lstnum=n%10;
        sum+=pow(lstnum,3);
        n=n/10;
    }
    if(sum==realnumber)
        return 1;

return 0;  

}

int main(){
    int n;
    cin>>n;
    
    if(checkArmstrong(n))
       cout<<"Number is Armstrong";
    else
       cout<<"Number is NonArmstrong";    
    return 0;
}
