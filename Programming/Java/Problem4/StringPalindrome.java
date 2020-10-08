import java.util.*;
public class StringPalindrome{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        // Taking string as a input

        String s = sc.next();
        int mid = s.length()/2;
        int j = s.length()-1;
        int i =0;
        boolean is = true;

        // Checking string is palindrome or not

        while(i<mid){
            if(s.charAt(i) != s.charAt(j)){
                is = false;
                break;
            }
            else{
                i++;
                j--;
                
            }
        }
        if(is == true){
            System.out.println("String is Palindrome..");
        }else{
            System.out.println("String is not Palindrome..");
        }
     }
}