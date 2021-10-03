import java.util.*;

public class CountDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp= number;
        int countDigit = 0;
        while(temp>0){
            countDigit++;
            temp=temp/10;
        }
        System.out.println("The number - "+number + " has - "+ countDigit+" digits.");
        sc.close();
    }
}
