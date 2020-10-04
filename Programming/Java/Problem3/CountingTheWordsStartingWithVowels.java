import java.util.*;

public class CountingTheWordsStartingWithVowels {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = obj.nextLine();
        s = s + " ";
        int i, x = 0;
        String word = "";
        for (i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                char c = Character.toLowerCase(word.charAt(0));
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                    x = x + 1;
                word = "";
            } else {
                word = word + ch;
            }
        }
        System.out.println("Number of Words starting with vowels=" + x);
    }
}