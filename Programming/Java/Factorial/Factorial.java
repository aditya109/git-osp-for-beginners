import java.util.*;
public class Factorial {
   public static void main(String[] args){
     int num;
      System.out.println("Enter the number to get factorial: ");
      Scanner reader= new Scanner(System.in);
      num=reader.nextInt();
        int factorial=1;
        if(num>0) {
            for(int i=1;i<=num;i++){
                factorial*=i;
            }
        System.out.println("Factorial of "+num+" is "+factorial);
        }
       else if(num<0){
        System.out.println("Not Defined ");
       }
      else{
        System.out.println(" factorial is 0 ");
      }
     }
}
