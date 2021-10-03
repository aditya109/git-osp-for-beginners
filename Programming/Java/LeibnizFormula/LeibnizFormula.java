public class LeibnizFormula {

    public static void main(String[] args) {
        System.out.println(leibniz(100000));
    }

    public static double leibniz(int k) {
        double sum = 0;
        for(int i=0; i<k; i++) {
            sum += leibnizStep(i);
        }

        return sum*4;
    }

    private static double leibnizStep(int k) {
        return Math.pow(-1, k) / (2*k +1);
    }
}
