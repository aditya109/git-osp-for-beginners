public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(isFibonacci(21));
        System.out.println(isFibonacci(28));
        System.out.println(isFibonacci(2));
    }
    public static int isFibonacci(int n){
        int n1=0,n2=1,n3,i;
        if (n==1||n==2){
            return 1;
        }
        for (i=2;i<n;++i){
            n3=n1+n2;
            if (n3==n){
                return 1;
            }
                n1=n2;
                n2=n3;
        }
        return 0;
    }
}