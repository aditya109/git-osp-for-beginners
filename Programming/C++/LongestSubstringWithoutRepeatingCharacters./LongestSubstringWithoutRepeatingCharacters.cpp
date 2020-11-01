/*
    The logic used here, is pretty simple. We first created a vector of size 128 and initialize it to 1.
    This means that atmost 1 occurence is allowed.
    Now we have two pointers i and j and a globalMax and localMax.
    Now we start our loop and when we visit any character, we decrement the count in visited array.
    Whenever the count becomes < 0 then we have repetion. So repetion is marked true.
    Also as the repeted character is counted, we will first reduce the localMax and then check for the condition.
    So till repetion is not removed, we try to shrink the range, by incrementing i and reducing the localMax in each case.
    Whenever our visited[ind] == 0 then repetion is removed and we look for more distinct characters.
    
    Do upvote, if you like the solution. 
*/
#include<bits/stdc++.h>
using namespace std;
int lengthOfLongestSubstring(string s) {
        vector<int>visited(128, 1);
        int i, j;
        i = j = 0;
        
        bool repetion = false;
        int globalMax = 0;
        int localMax = 0;
        
        while(j < s.size())
        {
            int index = s[j];
            visited[index]--;
            localMax++;
            
            if(visited[index] < 0)
                repetion = true;
            
            
            while(repetion)
            {
                localMax--;
                if(localMax > globalMax)
                    globalMax = localMax;
                
                int ind = s[i];
                visited[ind]++;
                
                if(visited[ind] == 0)
                    repetion = false;
                
                i++;
            }
            
            j++;
        }
        
        return max(localMax, globalMax);
        
}
int main(){
  string s;
  cin >> s;
  cout << lengthOfLongestSubstring(s)<<endl;
}
    
