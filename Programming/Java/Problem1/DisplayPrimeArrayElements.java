
public class DisplayPrimeArrayElements {
    public static void main(String[] args) {
        int n[] = new int[10];
        int i, j;
        for (i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random() * 100);
        }
        for (i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();

        for (i = 0; i < n.length; i++) {
            int f = 0;
            for (j = 2; j < n[i]; j++) {
                if (n[i] % j == 0) {
                    f++;
                }
            }

            if (f == 0)
                System.out.println(" Prime number=" + n[i]);
        }
    }
}
