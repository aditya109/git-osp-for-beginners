import java.util.Scanner;

public class CountingTheWordsStartingWithVowels {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        int result = getWordsCount(sentence);
        System.out.println(result);
    }

    private static int getWordsCount(String sentence) {
        String[] words = sentence.split(" ");
        int count = 0;
        for (String word: words){
            if(isStartingWithVowel(word)){
                count++;
            }
        }
        return count;
    }

    private static boolean isStartingWithVowel(String word) {
        char firstLetter = word.toLowerCase().charAt(0);
        return  firstLetter == 'a' ||
                firstLetter =='e' ||
                firstLetter == 'i' ||
                firstLetter == 'o' ||
                firstLetter == 'u';
    }

}
