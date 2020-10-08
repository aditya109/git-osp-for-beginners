
import java.util.Scanner;

public class Palindrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        //palindrome using string only
        char[] temp =A.toCharArray();
        char[] k = new char[temp.length];

        for(int i=0;i<=temp.length-1;i++){
            k[i]=temp[temp.length-i-1];
        }
        System.out.println(k);

        if(A.equals(String.valueOf(k))){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        //palindrome using StringBuffer
        StringBuffer sbu = new StringBuffer(A).reverse();
        System.out.println(sbu);
        if(A.equals(String.valueOf(sbu))){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        //palindrome using StringBuilder
        StringBuilder sb = new StringBuilder(A).reverse();
        System.out.println(sb);
        if(A.equals(String.valueOf(sb))){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
