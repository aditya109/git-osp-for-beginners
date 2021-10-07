#include <stdio.h>
int main() {
    int n, m, rever = 0, rex;
    printf("Enter any number: ");
    scanf("%d", &n);    
    m = n;
    if(n<0)
        { printf("false"); }
    else{
    //logic
    while (n > 0){
        rex = n % 10;
        rever = rever * 10 + rex;
        n = n / 10;
        }
    if (m == rever)
        { printf("true"); }
    else
        { printf("false"); } 
    }
    return 0; 
} 