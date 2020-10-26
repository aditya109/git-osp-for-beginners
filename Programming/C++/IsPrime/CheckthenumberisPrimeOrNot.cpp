#include <iostream>
using namespace std;

int main() 
{
    int i, num;
    bool prime= true;

    cout << "Enter an integer: ";
    cin >> num;
   
    if (num== 0 || num== 1) {
        Prime = false;
    }
    else {
        for (i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                Prime = false;
                break;
            }
        }
    }
    if (Prime)
        cout << num << " is a prime number";
    else
        cout << num << " is not a prime number";

    return 0;
}
