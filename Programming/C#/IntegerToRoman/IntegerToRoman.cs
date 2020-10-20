using System;
using System.Collections.Generic;
using System.Text;

namespace IntegerToRoman
{
    public class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter an integer number:");
            var number = Console.ReadLine();
            Console.WriteLine($"Roman number is: {IntegerToRoman(number)}");

            Console.ReadLine();
        }

        private static string IntegerToRoman(string number)
        {
            return IntegerToRoman(int.Parse(number));
        }

        private static string IntegerToRoman(int number)
        {
            var lookUpMap = new Dictionary<int, string>
            {
                { 1000, "M" },
                { 900, "CM" },
                { 500, "D" },
                { 400, "CD" },
                { 100, "C" },
                { 90, "XC" },
                { 50, "L" },
                { 40, "XL" },
                { 10, "X" },
                { 9, "IX" },
                { 5, "V"},
                { 4, "IV" },
                { 1, "I" },
            };
            var sb = new StringBuilder();
            var test = number;

            while (test > 0)
            {
                foreach (var num in lookUpMap)
                {
                    if (test >= num.Key)
                    {
                        sb.Append(num.Value);
                        test -= num.Key;
                        break;
                    }
                }
            }

            return sb.ToString();
        }
    }
}
