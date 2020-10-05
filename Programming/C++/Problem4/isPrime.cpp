#include <iostream>
using namespace std;

int main()
{
    int i, n;
    bool ispno = true;

    cout << "Enter a positive integer: ";
    cin >> n;

    // 0 and 1 are not prime numbers
    if (n == 0 || n == 1)
    {
        ispno = false;
    }
    else
    {
        for (i = 2; i <= n / 2; ++i)
        {
            if (n % i == 0)
            {
                ispno = false;
                break;
            }
        }
    }
    if (ispno)
        cout << n << " is a prime number";
    else
        cout << n << " is not a prime number";

    return 0;
}