import java.util.*;
public class ReverseNumber{
    public static void main(String[] args){
 
        Scanner sc = new Scanner(System.in);

        // Taking a number in input

        int number = sc.nextInt();

        int reverse = 0;

        // Reversing the number

        while(number>0){
          int lastDigit = number%10;
          reverse = reverse*10 + lastDigit;
          number/=10;
        }
        
        System.out.println(reverse);

        }

    }
