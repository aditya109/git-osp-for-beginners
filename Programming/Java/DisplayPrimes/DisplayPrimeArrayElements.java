import java.util.Scanner;

public class DisplayPrimeArrayElements {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // can be between 1 - 10^6
        int input[] = new int[n];
        for (int i =0; i<n; i++){
            input[i] = in.nextInt(); // any num between range [-10^9 to 10^9 ]
        }
        printArray(input);
        printPrimes(input);
    }

    private static void printPrimes(int[] input) {
        for ( int num: input){
            if ( num == 2){
                System.out.print(num+" ");
            }
            else if(num < 2){
                continue;
            }
            else {
                boolean isPrime = true;
                for (int factor = 2; factor <= num / factor; factor++) {
                    if ( num % factor == 0){
                        isPrime = false;
                        break;
                    }
                }
                if ( isPrime == true ){
                    System.out.print(num+" ");
                }
            }
        }
    }

    private static void printArray(int[] input) {
        System.out.println("Given Array: ");
        for (int num: input){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
