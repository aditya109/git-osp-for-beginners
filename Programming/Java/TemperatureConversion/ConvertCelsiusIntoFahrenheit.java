import java.util.*;
import java.util.Scanner;

public class ConvertCelsiusIntoFahrenheit {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a sentence");
        Scanner in = new Scanner(System.in);
        
        /* Input temperature in Celsius from user */
        System.out.print("Enter temperature in Celsius: ");
        float C = in.nextFloat();
        
        /* Convert Celsius to Fahrenheit */
        float F = C * (9f / 5) + 32;
        
        /* Print result */
        System.out.println(C + " degree Celsius is equal to " + F +" degree Fahrenheit.");
    }
}