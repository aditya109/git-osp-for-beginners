#include <iostream> 

using namespace std;

int main() 
{ 

int x, rev = 0, rem, ori; 
 cout<<"Enter an integer: "; 
 cin>>x;

 ori=x; 
 while (x != 0) 
 { 
 rem = x % 10; 
 rev = rev * 10 + rem; 
 x /= 10; 
 } 

if (ori>0)
{
    
  if(ori==rev) 
  cout<<"True"; 
  else 
  cout<<"False";
}
else
{
    cout<<"False";

}
  return 0; 


} 