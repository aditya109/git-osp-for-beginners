#include <iostream>

using namespace std;

bool IsPrime(int);

int main() {
    int arr[20];
    cout << "Enter 20 numbers:";
    //get 20 numbers from user
    for(int i=0;i<20;i++)
    {
        cin >> arr[i];
    }
    cout << "The Prime Numbers are:" << endl;
    for(int i=0;i<20;i++)
    {
        int num = arr[i];
        //calling IsPrime function
        if(IsPrime(num))
        {
            cout << num << endl ; 
        }
    }
 
    return 0;
}

bool IsPrime(int number)
    {
        //if number is 0 or 1 return false
        if(number==1||number==0) return false;
        //it is enough to check divisibility of half range of the number
        int m = number/2;
        for(int i=2;i<=m;i++)
        {
            //if divisible return false
            if(number%i == 0)
            {
                return false;
            }
        }
        return true;
    }