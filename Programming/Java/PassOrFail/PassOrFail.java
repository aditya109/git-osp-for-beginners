import java.util.*;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String sn[] = new String[5];
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println("Enter the name of a student");
            sn[i] = obj.nextLine();
        }
        for (i = 0;; i++) {
            System.out.println("Enter the name of student whose result you want to find out");
            String t = obj.nextLine();

            if (t.compareToIgnoreCase("EXIT") == 0) {
                break;
            } else {
                int c = 0;
                for (i = 0; i < 5; i++) {
                    if (t.compareToIgnoreCase(sn[i]) == 0) {
                        System.out.println(t + " " + "Passed");
                        c = 1;
                        break;
                    }
                }
                if (c == 0)
                    System.out.println(t + " " + "Failed");
            }
        }
    }
}