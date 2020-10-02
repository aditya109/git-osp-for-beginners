import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

class DisplayPrimeArrayElements {

  public static void main(String[] args) {
    // Get Input
    ArrayList<Integer> allNums = getInput(20);

    // Filter Numbers by checking for Prime
    ArrayList<Integer> primes = new ArrayList<Integer>();
    for(int num: allNums){
      if(isPrime(num)) {
        primes.add(num);
      }
    }

    // Print Output
    printResult(primes);
  }

  public static ArrayList<Integer> getInput(int count){
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> allNums = new ArrayList<Integer>();
    for(int i=0; i<count; i++){
      System.out.println("Enter number ("+ i +")");
      int number = input.nextInt();
      allNums.add(number);
    }
    return allNums;
  }

  public static boolean isPrime(int num){
    int m=num/2; //only check first half, other half is just inverse
    if(num==0||num==1){  
      return false;      
    }else{  
      for(int i=2;i<=m;i++){      
        if(num%i==0){      
          return false;
        }      
      }      
    }
    return true;
  }

  public static void printResult(ArrayList<Integer> primes){
    String sb = Arrays.toString(primes.toArray());
    System.out.println("Result: " + sb);
  }
}
