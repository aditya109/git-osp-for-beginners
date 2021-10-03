import java.util.Scanner;
import java.text.DecimalFormat;

/* 
The code below will convert Celcius to Fahrenheit
and displays it in the standard output
*/

public class CelciusToFahrenheit{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Celcius: ");
        Double temp = input.nextDouble();
        DecimalFormat df = new DecimalFormat("#0.##");   // 2 decimal format precision
        System.out.println(temp + "°C = " + df.format((temp * 1.8) + 32) + "°F");
    }
}