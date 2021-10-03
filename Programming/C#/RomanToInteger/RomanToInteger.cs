using System;
using System.Collections.Generic;

namespace RomanToInteger
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter an roman number:");
            var number = Console.ReadLine();

            Console.WriteLine("\nThe number is: " + RomanToInt(number));
        }

        static int RomanToInt(string roman)
        {
            roman = roman.ToUpper();
            var romanNums = new Dictionary<char, int>
            {
                {'M', 1000 },
                {'D', 500 },
                {'C', 100 },
                {'L', 50 },
                {'X', 10 },
                {'V', 5 },
                {'I', 1 },
            };

            var past = 0;
            var result = 0;
            var repeats = 0;
            foreach (var i in roman)
            {
                if (past == 0)
                {
                    result += romanNums[i];
                }
                else
                {
                    if (romanNums[i] < past)
                    {
                        result += romanNums[i];
                        repeats = 0;
                    }
                    if (romanNums[i] == past)
                    {
                        result += romanNums[i];
                        repeats++;
                    }
                    if (romanNums[i] > past)
                    {
                        result += romanNums[i] - (2*past);
                        repeats = 0;
                    }
                }
                
                if (repeats > 2)
                {
                    return 0;
                }

                past = romanNums[i];
            }

            return result;
        }
    }
}
