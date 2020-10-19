// Solution implemented using Dynamic Programming Paradigm


import java.util.Scanner;

class LongestPalinSubstr { 
    static void displaySubstr(String str, int low, int high) { 
        System.out.println(str.substring(low, high + 1)); 
    } // used to print the sub-string

    static void findLongestPalin(String str) { 
        int n = str.length(); 
 
        // table[][] used for tabulation (DP)
        // IF substring from i to j IS Palindrome THEN table[i][j] TRUE , OTHERWISE it is FALSE
        boolean table[][] = new boolean[n][n]; 

        // It is ovious that all substrings of length 1 are palindromes so make them TRUE. 
        int maxLength = 1; 
        for (int i = 0; i < n; ++i) 
            table[i][i] = true; 

        // Sub-string of length 2 will be palindrome if both characters are the SAME. 
        int start = 0; 
        for (int i = 0; i < n - 1; ++i) { 
            if (str.charAt(i) == str.charAt(i + 1)) { 
                table[i][i + 1] = true; 
                start = i; 
                maxLength = 2; 
            } 
        } 
        // Now chek for the sub-strings greater than 2.
        for (int k = 3; k <= n; ++k) { 
            for (int i = 0; i < n - k + 1; ++i) { 
                // Getting the ending index of substring from starting index i and length k 
                int j = i + k - 1; 

           	// checking for possible sub-strings
                if (table[i + 1][j - 1] 
                    && str.charAt(i) == str.charAt(j)) { 
                    table[i][j] = true; 

                    if (k > maxLength) { 
                        start = i; 
                        maxLength = k; 
                    } 
                } 
            } 
        } 
        System.out.print("Longest Palindromic Substring in '" + str + "' is : "); 
   	displaySubstr(str, start, start + maxLength - 1); 
    } 

    public static void main(String[] args) { 
	String str;
	System.out.print("\nEnter a String : ");
	Scanner scan = new Scanner(System.in);
	str = scan.next();
        findLongestPalin(str); 
	scan.close();
    } 
} 

