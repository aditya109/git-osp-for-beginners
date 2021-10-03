import java.util.*;

public class ConvertCelciusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a temperature in degrees Celcius: ");
        Double tempC = input.nextDouble();
        Double tempF = (tempC * 1.8) + 32;
        System.out.println(tempC.toString() + " degrees Celcius = " + tempF.toString() + " degrees Fahrenheit.");
    }
}