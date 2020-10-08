#include <bits/stdc++.h>

using namespace std;


int main()
{
    std::ios_base::sync_with_stdio(false);

    int Lcase = 0, Ucase = 0, digit = 0, sp = 0;

    string s;
    cout << "Enter Your Password: " ;
    cin >> s;

    for (int i = 0; i < s.length(); ++i) {

        if (islower(s[i])) {
            Lcase += 1;
        }
        if (isupper(s[i])) {
            Ucase += 1;

        }
        if (isdigit(s[i])) {
            digit += 1;
        }
        if (!isalpha(s[i]) && !isdigit(s[i])) {
            sp += 1;
        }
    }

    if ((Lcase && Ucase && digit && sp >= 1) && (s.length() >= 8)) {
        cout << "TRUE" << endl;
    } else {
        cout << "FALSE" << endl;
    }
}

