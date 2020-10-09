/*


Prime Game
Given two integers x and y(x>y). The only operation you can perform is, choose any Prime integer m
and subtract it any number of times from x. The task is to determine whether it is possible to make x
equal to y.

Input format
The first line and the only line of input contains two integers x and y  separated by space.

Output format
Output "YES" (without quotes, in capital) if it is possible to make x equal to y, otherwise output "NO"(without quotes, in capital).

Constraints
1<=x,y<=10^18

*/

#include <bits/stdc++.h>
using namespace std;
#define ll long long
int main()
{
  ll x,y;
  cin>>x>>y;
  if(abs(x-y)==1){
    cout<<"NO"<<endl;
  }
  else{
    cout<<"YES"<<end
  }
  return 0;
}
