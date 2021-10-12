using System.Collections.Generic;
using System.Linq;
using System;
using System.Text;

namespace CombinationSum
{
    //more on: https://github.com/pakosel/leetcode-solutions
    public class Solution
    {
        Dictionary<int, List<IList<int>>> cache = new Dictionary<int, List<IList<int>>>();
        int[] candidates;

        public IList<IList<int>> CombinationSum(int[] candidates, int target)
        {
            Array.Sort(candidates);
            this.candidates = candidates;
            return FindSumCombinations(target);
        }

        private List<IList<int>> FindSumCombinations(int target)
        {
            var res = new List<IList<int>>();

            if (cache.ContainsKey(target))
                return cache[target];

            foreach (var candidate in candidates)
            {
                var lookingFor = target - candidate;
                if (lookingFor < 0)
                    break;

                if (lookingFor == 0)
                    res.Add(new int[] { candidate });
                else
                {
                    var subCombinations = FindSumCombinations(lookingFor);
                    if (subCombinations.Count == 0)
                        continue;
                    foreach (var combination in subCombinations)
                    {
                        var newItem = combination.ToList();
                        newItem.Add(candidate);
                        newItem.Sort();
                       
                        if (!res.Any(l => l.SequenceEqual(newItem)))
                            res.Add(newItem);
                    }
                }
            }

            cache.Add(target, res);
            return res;
        }
    }
}