import java.util.*;   

class SimplePalindrome  
{  
   public static void main(String args[])  
   {  
      String original, reverse = "";  
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a number or an String to check whether it is palindrome");  
      original = in.nextLine();   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number isn't a palindrome.");   
   }  
}  