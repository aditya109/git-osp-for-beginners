
//Unique Approach of Finding if two Strings are Anagrams

/*Map each of 26 english characters to a prime number
Then multiply each character with the prime value. If both the values are same it is anagram else it is not an anagram.
EXAMPLE-
F(A) = 2, F(E) = 5, F(R) = 7

F(ARE) = 2*5*7 = 70
F(EAR) = 5*2*7 = 70

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Anagram {
	public void isAnagram(String s1, String s2, HashMap<Character,Integer> map) {
        if(s1.length()!=s2.length()){
            System.out.println("NO");
            return;
        }
        int i = 0, j = 0;
        int p1 = 1, p2 = 1;
        while(i<s1.length())
            p1 = p1 * map.get(s1.charAt(i++));
        while(j<s2.length())
            p2 = p2 * map.get(s2.charAt(j++));
        if(p1==p2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }


    public HashMap<Character,Integer> findPrimes(){
        int status = 1;
        int num = 3;
        char alpha = 'B';
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('A',2);
        for ( int i = 2 ; i <=26 ;  )
        {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
            {
                if ( num%j == 0 )
                {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 )
            {
                map.put(alpha++,num);
                i++;
            }
            status = 1;
            num++;
        }
        return map;
    }


    public static void main(String[] args)throws IOException {
        Anagram a = new Anagram();
        HashMap<Character,Integer> map = a.findPrimes();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t--> 0){
            String[] s = br.readLine().split("\\s+");
            a.isAnagram(s[0].toUpperCase(),s[1].toUpperCase(),map);
        }
    }
}