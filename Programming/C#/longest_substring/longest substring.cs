// C# program to find the length of the  
// longest substring without repeating  
// characters  
using System; 
   
class GFG{ 
   
// This function returns true if all characters in 
// str[i..j] are distinct, otherwise returns false 
public static bool areDistinct(string str,  
                               int i, int j) 
{ 
      
    // Note : Default values in visited are false 
    bool[] visited = new bool[26]; 
   
    for(int k = i; k <= j; k++) 
    { 
        if (visited[str[k] - 'a'] == true) 
            return false; 
               
        visited[str[k] - 'a'] = true; 
    } 
    return true; 
} 
   
// Returns length of the longest substring 
// with all distinct characters. 
public static int longestUniqueSubsttr(string str) 
{ 
    int n = str.Length; 
       
    // Result 
    int res = 0;  
       
    for(int i = 0; i < n; i++) 
        for(int j = i; j < n; j++) 
            if (areDistinct(str, i, j)) 
                res = Math.Max(res, j - i + 1); 
                   
    return res; 
} 
   
// Driver code 
public static void Main() 
{ 
    string str = "abcabcbb"; 
    Console.WriteLine("The input string is " + str); 
   
    int len = longestUniqueSubsttr(str); 
       
    Console.WriteLine("The length of the longest " + "non-repeating character " + "substring is " + len); 
} 
} 
