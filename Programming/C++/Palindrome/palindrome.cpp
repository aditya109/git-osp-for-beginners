#include<bits/stdc++.h>
using namespace std;
int main() {
    int n, reversedN = 0, remainder, originalN;
    cin >> n;
    originalN = n;
    while (n != 0) {
        remainder = n % 10;
        reversedN = reversedN * 10 + remainder;
        n /= 10;
    }

    if (originalN == reversedN)
        printf("%d is a palindrome.", originalN);
    else
        printf("%d is not a palindrome.", originalN);

    return 0;
}
