import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String args[]){
       
		    // Get number from user
        System.out.println("Enter a number : ");
        int x = new Scanner(System.in).nextInt();
       
		    // Check if x is palindrome
        if(isPalindrome(x)){
            System.out.println(x + " is a palindrome");
        }else{
            System.out.println(x + " is not a palindrome");
        }      
    }
 
	  // Given an integer x, return true if x is palindrome integer
    public static boolean isPalindrome(int x) {
		  // Negative numbers can not be palindrome
		  if (x < 0)	return false;
		  // 1-digit numbers are palindrome
		  if (x < 10)	return true;

      int palindrome = x; 
      int reverse = 0;

		  // The reverse of given x
      while (palindrome != 0) {
          int remainder = palindrome % 10;
          reverse *= 10 + remainder;
          palindrome /= 10;
      }

		  // if x and reversed x is equal, return true
      if (x == reverse)
          return true;
      return false;
    }
}
