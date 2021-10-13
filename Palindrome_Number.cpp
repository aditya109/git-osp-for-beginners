#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    string str;
    cin>>str;
    string s= str;
    reverse(str.begin(), str.end());

    if(s == str){
        cout<<"true"<<endl;
    }
    else{
        cout<<"false"<<endl;
    }

    return 0;
}
