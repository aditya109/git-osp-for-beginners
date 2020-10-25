import java.util.Scanner;

public class EvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your favorite real number.");
        int num = scan.nextInt();
        System.out.println();
        condition(num);

        if(num % 2 == 0)
            System.out.println(num + " Is an even number.");
        else
            System.out.println(num + " Is an odd number.");
    }

    static void condition(int value)
    {
        if(value <= 0) {
            System.out.println("That number isn't even or odd. Try again.");
            main(null);
        }
    }
}
