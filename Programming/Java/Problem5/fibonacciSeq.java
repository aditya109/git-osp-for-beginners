public class fibonacciSeq {

    public static void main(String[] args) {

        int n = 10, temp1 = 0, temp2 = 1;
        System.out.print("First " + n + " terms: ");
		/*For loop to calcualate seq*/
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " + ");

            int sum = temp1 + temp2;
            temp1 = temp2;
            temp2 = sum;
        }
    }
}