# include<iostream>
using namespace std;
# define MAX_COUNT 100
void printParenthesesPairs(int pos, int n, int open, int close){
   static char str[MAX_COUNT];
   if(close == n) {
      cout<<str<<endl;
      return;
   }
   else {
      if(open > close) {
         str[pos] = ')';
         printParenthesesPairs(pos+1, n, open, close+1);
      }
      if(open < n) {
         str[pos] = '(';
         printParenthesesPairs(pos+1, n, open+1, close);
      }
   }
}
int main() {
   int n;
   
   cout<<"Enter a number for Parenthesis Combinations: ";
   cin>>n;
   if(n > 0)
      printParenthesesPairs(0, n, 0, 0);
   getchar();
   return 0;
}
