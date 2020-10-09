#include<bits/stdc++.h>
using namespace std;
int main(){
  
	int count = 0;
	string str;
	getline(cin,str);
	
	//to convert the string to lowercase
	transform(str.begin(), str.end(), str.begin(), ::tolower);
   	
	//  Checks whether the 1st character is a vowel  
	if(str[0]=='a' || str[0]=='e' || str[0]== 'i' || str[0]== 'o' || str[0]== 'u') {  
    //Increments the vowel counter  
        count++;  
    }
	  
	for(int i=1;i<str.length(); i++){   
 
      if((str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u') && str[i-1]==' ') {  
           //Increments the vowel counter  
            count++;  
        }  
	}
	
	cout<<count;
	return 0;
}
