import java.util.Scanner;

public class DisplayHighestRunsScored {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of players: ");
        int numberOfPlayers = obj.nextInt();
        obj.nextLine(); // https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
        String cp[] = new String[numberOfPlayers];
        int run[] = new int[numberOfPlayers];
        String player = cp[0];
        int maxScore;
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Enter the name and runs scored by the cricket player : ");
            cp[i] = obj.nextLine();
            run[i] = obj.nextInt();
            obj.nextLine() ;
        }
        maxScore = -1;

        for (int i = 0; i < numberOfPlayers; i++) {
            if (run[i] > maxScore) {
                maxScore = run[i];
                player = cp[i];
            }
        }
        System.out.println("The name and runs scored by the cricket player : " + player + " " + maxScore);

    }
}
