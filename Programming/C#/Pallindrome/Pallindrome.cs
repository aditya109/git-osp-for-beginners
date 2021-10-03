using System;

namespace Pallindrome
{
    class Program
    {
        static void Main(string[] args)
        {
            int num, rem, sum = 0, temp; 
            Console.WriteLine("\n >>>>Enter a number to discover if Number is Palindrome or not <<<< ");
            Console.Write("\n Enter a number: ");
            num = Convert.ToInt32(Console.ReadLine());
            temp = num;
            while (num > 0)
            {
                rem = num % 10; 
                num = num / 10; 
                sum = sum * 10 + rem;
            }            
            if (temp == sum)   
            {
                Console.WriteLine("\n Number is Palindrome \n\n");
            }
            else
            {
                Console.WriteLine("\n Number is not a palindrome \n\n");
            }
            Console.ReadLine();
        }
    }
}
