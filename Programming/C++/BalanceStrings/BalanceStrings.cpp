#include <iostream>
#include <string>

using namespace std;

int balancedStringSplit(string s)
{
    int cr = 0, cl = 0, c = 0;
    for (int i = 0; i < s.length(); i++)
    {
        if (s[i] == 'R')
        {
            cr++;
        }
        else if (s[i] == 'L')
        {
            cl++;
        }
        if (cr == cl)
        {
            c++;
            cr = 0;
            cl = 0;
        }
    }
    return c;
}

int main()
{
    string s;
    cin >> s;

    cout << balancedStringSplit(s);

    return 0;
}