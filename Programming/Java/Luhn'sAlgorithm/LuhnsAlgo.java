import java.lang.*;
import java.util.*;

/* Note:

   Inputs for the following Cards are valid :

     1.American Express starting with 34 or 37
     2.VISA starting with 4
     3.Master Card with 51, 52, 53, 54, 55

 */

public class LuhnsAlgo {
    public static void main(String[]args){

        //Step 1: Take user-input and it should only be positive no's without any "-" or any other special character
        Scanner nsc = new Scanner(System.in);
        String creditCardNo;
        do {

            System.out.println("Please Enter the Credit-Card No : ");
            creditCardNo = nsc.nextLine().replaceAll("[ -]","");

        }while( creditCardNo.matches("[[0-9]{1,15}[a-zA-Z]{1,14}]+") || Long.parseLong(creditCardNo) <= 0 );

        Long cc_no = Long.parseLong(creditCardNo);

        //Step 2: check whether the length of the credit no. are valid or not

        //we can directly find the length using built-in string function to make the process easy
        int c_Length = creditCardNo.length();

        /*
        if(c_Length == 13 || c_Length == 15 || c_Length == 16){

        }
        */

        //Step 3: Calculate the checksum using Algorithm
        int luhn = luhnAlgo(cc_no);

        // this is a custom length valid function
        // here if the remainder of the even + odd is "0" then card is valid

        //Step 4: Checking the length of Credit Card no.
        if(lengthIsValid(cc_no) && luhn == 0) {

            //Step 5: lastly we have to check which card belongs to which company and print company name accordingly
            int digit = firstDigitChecker(cc_no);

            if(c_Length == 13 && digit == 13 || c_Length == 16 && digit == 13){
                System.out.println("VISA");
            }
            else if(c_Length == 15 && digit == 15){
                System.out.println("AMEX");
            }
            else if(c_Length == 16 && digit == 16){
                System.out.println("MASTERCARD");
            }
            else{
                System.out.println("INVALID");
            }
        }
        else{
            System.out.println("INVALID");
        }

    }

    private static int firstDigitChecker(Long cc_no) {

        //AMERICAN EXPRESS
        if(cc_no >= 34e13 && cc_no < 35e13 || cc_no >= 37e13 && cc_no < 38e13){
            return 15;
        }
        //MASTERCARD
        else if(cc_no >= 51e14 && cc_no <56e14){
            return 16;
        }
        //VISA
        else if(cc_no >= 4e12 && cc_no <5e12 || cc_no >= 4e15 && cc_no <5e15){
            return 13;
        }
        //NONE of them
        else{
            return -1;
        }
    }

    // According to Luhn's Algorithm
    private static int luhnAlgo(Long cno) {

        int even = 0;
        int odd = 0;
        long counter = cno;

        int i=1;
        while (counter > 0) {

            // for even no. starting from the rear-end
            if(i%2==0){
                // we have to multiply them with 2
                long t = ((counter % 10) * 2);
                // if product is a 2-digit no. then split it and add it with rest of the digits till front-end
                //i.e 2*6 = 12 -> 1+2 = 3
                even += (t % 10) + (t / 10);

            }
            else{
                // we have to add odd no. digits staring from rear-end till front-end
                odd += counter % 10;
            }
            counter /= 10;
            i++;
        }

        return (even + odd) % 10;
    }

    private static boolean lengthIsValid(Long cc_no) {

        int length = 0;
        while(cc_no != 0){
            cc_no /= 10;
            length++;
        }

        return length == 13 || length == 15 || length == 16;
    }
}
