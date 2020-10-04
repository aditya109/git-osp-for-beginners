import java.util.*;

public class DisplayHighestRunsScored {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = 11;
        String cp[] = new String[size];
        int run[] = new int[size];
        int i;
        int highest;
        for (i = 0; i < size; i++) {
            System.out.println("Enter the name and runs scored by the cricket player : ");
            cp[i] = obj.nextLine();
            run[i] = obj.nextInt();
        }
        highest = run[0];

        for (i = 1; i < size; i++) {
            if (run[i] > highest) {
                highest = run[i];
            }
        }
        System.out.println("The name and runs scored by the cricket player : " + cp[i - 1] + " " + highest);

    }

}
