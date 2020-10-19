using System;
using System.Text;

namespace ReverseInteger
{
    public class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter an integer number:");
            var number = Console.ReadLine();
            Console.WriteLine($"Reverse number is: {ReverseInteger(number)}");

            Console.ReadLine();
        }

        public static string ReverseInteger(string stringNumberWithSign)
        {
            var sb = new StringBuilder();
            var charArray = stringNumberWithSign.Replace("-", string.Empty).ToCharArray();
            Array.Reverse(charArray);
            sb.Append(charArray);
            if(stringNumberWithSign.StartsWith('-'))
            {
                sb.Insert(0, '-');
            }
            return sb.ToString();
        }
    }
}
