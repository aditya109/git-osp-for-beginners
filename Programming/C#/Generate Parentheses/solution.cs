using System.Collections.Generic;
using System.Linq;
using System;
using System.Text;

namespace GenerateParentheses
{
    //more on: https://github.com/pakosel/leetcode-solutions
    public class Solution
    {
        List<string> result = new List<string>();
        int maxLen;

        public IList<string> GenerateParenthesis(int n)
        {
            maxLen = n;
            GenerateAndCheck("", 0, 0);
            return result;
        }

        private void GenerateAndCheck(string str, int opened, int closed)
        {
            if (opened == closed && opened == maxLen)
            {
                result.Add(str);
                return;
            }

            if (opened < maxLen)
                GenerateAndCheck(str + "(", opened + 1, closed);
            if (closed < opened)
                GenerateAndCheck(str + ")", opened, closed + 1);
        }
    }

}