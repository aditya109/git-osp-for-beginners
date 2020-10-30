using System;

namespace Palindrome
{
    class Palindrome
    {
        static void Main(string[] args)
        {
            int number, r, sum = 0, temp;

            Console.Write("Enter the number: ");
            number = int.Parse(Console.ReadLine());
            temp = number;
            Console.WriteLine();

            while (number > 0)
            {
                r = number % 10;
                sum = (sum * 10) + r;
                number = number / 10;
            }

            if (temp == sum)
                Console.Write("Number is a palindrome.");
            else
                Console.WriteLine("Number is not a palindrome");

            Console.WriteLine();
            Console.WriteLine();
            Console.WriteLine("Press enter to close...");
            Console.ReadLine();
        }
    }
}
