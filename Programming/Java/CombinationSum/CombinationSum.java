import java.util.*;

public class CombinationSum {
    public  static void  main(String[] args) {
        public static void main (String[]args){
            int[] nums = {2, 3, 5};
            List<List<Integer>> resultCombination = combinationSumUtility(nums, 8);

            /*
             * The output in the format:
             * [[2,2,3],[7]]
             * The following is the implementation of the same,
             */
            StringBuilder resultString = new StringBuilder();
            resultString.append("[");
            for (List<Integer> lists : resultCombination) {
                resultString.append("[");
                for (Integer innerList : lists)
                    resultString.append(innerList + ",");
                resultString.deleteCharAt(resultString.length() - 1);
                resultString.append("],");
            } // print loop
            resultString.deleteCharAt(resultString.length() - 1).append("]");
            if (resultCombination.size() != 0)
                System.out.println(resultString.toString());
            else
                System.out.println("[]");
        }
    }

        /*
         *
         * The function is used for calling the utility for creating different combination.
         */
        public static List<List<Integer>> combinationSumUtility(int[] candidates, int target) {
            List<List<Integer>> result = new ArrayList();
            Arrays.sort(candidates);
            backtrack(candidates, 0, target, new ArrayList(), result);
            return result;
        }

        /*
         *
         * The backstraking function will check the list of numbers provided one by one.
         * The recursive function keeps on adding an integer to the current temporary list of integers and keeping track of the remaining sum
         * required to add up to the given target.
         * Inside the recursive function, There are two base cases.
         * 1st: To check if the remaining sum required goes negative, it willreturn from the recursive function.
         * 2nd: The required condition if the remaining sum equals zero.
         * If the remaining sum is zero this means that we have reached our required target.
         * At that point, we push the current temporary list of integers into the output array of arrays.
         */
        private static void backtrack(int[] original, int start, int target, List<Integer> list, List<List<Integer>> result) {
            if(target < 0)
                return;
            if(target == 0)
                result.add(new ArrayList(list));
            for(int i = start; i < original.length; i++) {
                list.add(original[i]);
                backtrack(original, i, target - original[i], list, result);
                list.remove(list.size() - 1);
            }
        }
}