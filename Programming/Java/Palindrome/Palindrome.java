package com.kholood;
import java.util.Scanner;
import java.lang.String;

public class palindrome {

    public static void main(String [] args){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number: ");
            String reverse = "";
            String num = sc.nextLine();
            int length = num.length();

            for( int i = length - 1; i >= 0; i-- )
                reverse = reverse + num.charAt(i);
            if (num.equals(reverse))
                System.out.println("The entered string " +num +" is a palindrome.");
            else
                System.out.println("The entered string " +num +"  isn't a palindrome.");

        System.out.print("Enter the string you want to check: ");
        String original = sc.nextLine();
        int n = original.length();
        String reversestring="";
        for(int i = n - 1; i >= 0; i--)
        {
            reversestring = reversestring + original.charAt(i);
        }
        if(original.equalsIgnoreCase(reversestring))
            System.out.println("The string is palindrome.");
        else
            System.out.println("The string is not palindrome.");


        }
    }
