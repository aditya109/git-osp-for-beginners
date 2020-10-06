public class DisplayPrimeArrayElements {
    public static void main(String[] args) {
        int n[] = new int[10];
        int i, j;
        for (i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random());// If a number is multiplied by 100, it definitely is not a Prime number.
        }
        for (i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();

        for (i = 0; i < n.length; i++) {
            int f = 0;
            
            // Handled some corner cases
            if(n[i] == 1 || n[i] <= 0) {
                f++;
                continue;
            }
            
            // Reduced the number of iterations
            for (j = 2; j < Math.sqrt(n[i]); j++) {
                if (n[i] % j == 0) {
                    f++;
                }
            }

            if (f == 0)
                System.out.println("Prime number=" + n[i]);
        }
    }
}
