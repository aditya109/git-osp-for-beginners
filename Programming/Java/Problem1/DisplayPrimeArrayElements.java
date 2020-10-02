public class DisplayPrimeArrayElements {
public static void main(String[] args) {
    System.out.println("Enter the no. of elemets");

    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] a = new int[n];
    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < n; i++) {
        a[i] = s.nextInt();
    }
    for (int i = 0; i < a.length; i++) {
        boolean isPrime = true;
        for (int j = 2; j < a[i]; j++) {

            if (a[i] % j == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println(a[i]);
        }
    }
}
