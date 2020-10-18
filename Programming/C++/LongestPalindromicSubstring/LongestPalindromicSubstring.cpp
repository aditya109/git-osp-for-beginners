#include <bits/stdc++.h>
using namespace std;

void printSubStr(char *str, int low, int high)
{
    for (int i = low; i <= high; ++i)
        cout << str[i];

    cout << endl;
}

int longestPalSubstr(char *str)
{
    int maxLength = 1;

    int start = 0;
    int len = strlen(str);

    int low, high;

    for (int i = 1; i < len; ++i)
    {
        low = i - 1;
        high = i;
        while (low >= 0 && high < len && str[low] == str[high])
        {
            if (high - low + 1 > maxLength)
            {
                start = low;
                maxLength = high - low + 1;
            }
            --low;
            ++high;
        }

        low = i - 1;
        high = i + 1;

        while (low >= 0 && high < len && str[low] == str[high])
        {
            if (high - low + 1 > maxLength)
            {
                start = low;
                maxLength = high - low + 1;
            }
            --low;
            ++high;
        }
    }

    cout << "Longest palindrome substring is: ";
    printSubStr(str, start, start + maxLength - 1);

    return maxLength;
}

int main()
{
    string s;
    cin >> s;
    int n = s.length();
    char str[n + 1];
    strcpy(str, s.c_str());
    longestPalSubstr(str);
    return 0;
}