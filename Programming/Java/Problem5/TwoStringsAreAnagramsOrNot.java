// Java program to check whether two strings are anagrams or not


import java.io.*;
import java.util.*;

public class Anagram{

static boolean areAnagram(char[] str1, char[] str2)
{
int n1 = str1.length;
int n2 = str2.length;

// If the length is not same then they are not anagram
if (n1 != n2)
return false;

// Sort both strings
Arrays.sort(str1);
Arrays.sort(str2);

// Compare both sorted strings
for (int i = 0; i < n1; i++)
if (str1[i] != str2[i])
return false;

return true;
}

public static void main(String args[])
{
Scanner scan = new Scanner(System.in);

// Taking inputs
System.out.print("Enter First String : ");
String str1 = scan.nextLine();
System.out.print("Enter Second String : ");
String str2 = scan.nextLine();

//Converting it to array
char[] ArrayStr1 = str1.toLowerCase().toCharArray();  
char[] ArrayStr2 = str2.toLowerCase().toCharArray();  

if (areAnagram(ArrayStr1, ArrayStr2))
System.out.println("The two strings are anagram");
else
System.out.println("The two strings are not anagram");
}
}
