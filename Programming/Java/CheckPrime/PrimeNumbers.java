import java.util.Scanner;

public class PrimeNumbers {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number till which you want to find to all prime numbers smaller than or equal your number");
            int n = sc.nextInt();
            System.out.print("all the prime numbers smaller than or equal to " + n);
            PrimeNumbers p = new PrimeNumbers();
            p.findNumbers(n);
        }
        private void findNumbers(int n) {

            boolean prime[] = new boolean[n+1];
            for(int i=0;i<n;i++)
                prime[i] = true;

            for(int j = 2; j*j <=n; j++)
            {
                if(prime[j] == true)
                {
                    for(int i = j*j; i <= n; i += j)
                        prime[i] = false;
                }
            }
            for(int i = 2; i <= n; i++)
            {
                if(prime[i] == true)
                    System.out.print(i + " ");
            }

        }
    }
