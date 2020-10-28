// Program to convert Roman to numerials
#include <bits/stdc++.h> 
using namespace std; 

int romanToInteger(char c)
{
  switch(c)
  {
    case 'I' : return 1;
    case 'V' : return 5;
    case 'X' : return 10;
    case 'L' : return 50;
    case 'C' : return 100;
    case 'D' : return 500;
    case 'M' : return 1000;
  }
  return 0;
}
    
int romanToInt(string s) {
  int size = s.size();
  if(size==0)
    return 0;
  int result = 0;
  for(int i=1; i<size; i++)
  {
    if( romanToInteger(s[i]) > romanToInteger(s[i-1]) )
      result -= romanToInteger(s[i-1]);
    else
      result += (romanToInteger(s[i-1]));
  }
  result += romanToInteger(s.back());
  return result;
}

// Driver Program 
int main() 
{ 
	// Considering inputs given are valid 
	string str = "MCMIV"; 
	cout << "Integer form of Roman Numeral is "
		<< romanToInt(str) << endl; 

	return 0; 
} 
