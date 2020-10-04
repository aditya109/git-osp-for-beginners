import java.util.Scanner;

public class CountingTheWordsStartingWithVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = sc.nextLine().trim();
		String []a = s.split(" ");
		int count = 0;
        for (int i = 0; i < a.length; i++) {
            char c = a[i].charAt(0);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            	count++;
            }
        }
        System.out.println("Number of Words starting with vowels = " + count);
    }
}
