// Palin Pairs
// https://www.hackerearth.com/problem/algorithm/palin-pairs/
import java.util.*;
public class PalinPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            list.add(sc.next().trim());
        }
        System.out.println(list);
        int count = 0;
        for(int i=0;i<t;i++)
        {
            for(int j=0;j<t;j++)
            {
                if(i<j)
                {
                    String a = list.get(i);
                    String b = new StringBuffer(list.get(j)).reverse().toString();
                    if(a.equals(b)) count++;
                }
            }
        }
        System.out.println(count);
    }
}