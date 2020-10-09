public class Porcupine {
    public static void main(String[] args) {
        System.out.println(isPorcupine(130));
    }
    public static int isPorcupine(int n){
        int p=0;
        for (int i=n+1;p==0;i++){
            if (isPrime(i)==1){
                if (i%10==9){
                    p=i;
                    break;
                }
            }
        }
        return p;
    }
    public static int isPrime(int n){
        int flag=1;
        for (int i=2;i<n/2;i++){
            if (n%i==0){
                flag=0;
                break;
            }
        }
        return flag;
    }
}