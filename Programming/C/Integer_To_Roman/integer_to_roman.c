#include<stdio.h>
#include<stdlib.h>

//defining the function
void int_to_roman(num){
    //creating lists for the conversion
    int nums[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    char romans[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    int i = 0;
    //while loop fpr printing the roman
    while(num){
        while(num/nums[i]){
            printf("%s",romans[i]);
            num -= nums[i];
        }
        i++;
    }
}

//driver code
int main(){
    int n;
    printf("Enter the number for converting into roman: ");
    scanf("%d",&n);
    int_to_roman(n); // calling the function
    return 0;
}