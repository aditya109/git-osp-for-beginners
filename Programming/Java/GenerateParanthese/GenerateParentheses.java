import java.util.*;

public class GenerateParentheses{
    public  static void  main(String[] args) {
        int num=0;
        List<String> resultList=num>=1 && num<=8 ?generateParenthesisUtility(num):Arrays.asList("Enter number between 1 and 8");
        System.out.println(resultList);
    }

    /*
    The idea behind this solution is to insert a closure "()" each time, by this way, you can never have incorrect answers,
    but will have a lot of duplications, so using Set to remove the same.
     */

    public static List<String> generateParenthesisUtility(int n) {
        /*
        base case is n=1 as 'n' can be between 1 and 8
         */
        if(n==1) return new ArrayList<String>(Arrays.asList("()"));
        Set<String> set=new HashSet<String>();
        for(String str:generateParenthesisUtility(n-1)){
            for(int i=0;i<str.length();i++){
                set.add(str.substring(0,i+1)+"()"+str.substring(i+1,str.length()));
            }
        }
        List<String> list = new ArrayList<String>(set);
        return list;
    }
}