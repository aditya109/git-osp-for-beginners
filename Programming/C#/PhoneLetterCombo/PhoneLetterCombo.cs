using System;
using System.Collections.Generic;
using System.Text;

namespace PhoneLetterCombo
{
    class PhoneLetterCombo
    {
        private static string[] digitToLetter = new string[]{
          "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        private static List<string> Letters = new List<string>();

        private static List<string> LetterCombos = new List<string>();

        static void Main(string[] args)
        {
            List<int> phoneDigits = new List<int>();
            Console.WriteLine("Input phone number digits.");
            Console.WriteLine("Input: digits = ");

            string value = Console.ReadLine();

            foreach (char num in value)
            {
                int digitValue = 0;
                Int32.TryParse(num.ToString(), out digitValue);
                phoneDigits.Add(digitValue);
            }

            foreach(int num in phoneDigits){

                Letters.Add(getLettersForDigit(num));
            }

            buildCombo(0, new StringBuilder());
            Console.WriteLine("Output: ");

            LetterCombos.ForEach(Console.WriteLine);
        }

        private static string getLettersForDigit(int digit){

          if (digit > 1 && digit < 10){
            return digitToLetter[digit - 2];
          }
          return string.Empty;

        }

        private static void buildCombo(int index, StringBuilder combo){
          if (combo.Length == Letters.Count){
            LetterCombos.Add(combo.ToString());
            return;
          }

          foreach(char letter in Letters[index]){
            combo.Append(letter.ToString());
            buildCombo(index + 1, combo);
            combo.Remove(combo.Length - 1, 1);
          }

        }
    }
}
