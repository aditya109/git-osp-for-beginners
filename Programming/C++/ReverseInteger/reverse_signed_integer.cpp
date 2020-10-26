#include <iostream> 
using namespace std;
int reverse_digits(int num);
   
int main() { 
    int num; 
    cout << "\nEnter an Integer : ";
    cin >> num;
    cout << "\nInput Integer : " << num;
    cout << "\nReversed Integer : " << reverse_digits(num) << "\n\n"; 

    return 0; 
} 
int reverse_digits(int num) { 
    int rev_num = 0; 
    while (num > 0) { 
        rev_num = rev_num*10 + num%10; 
        num = num/10; 
    } 
    return rev_num; 
} 

