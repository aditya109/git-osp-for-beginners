import java.util.Scanner;

public class StrongPassword {

// For minimum password length
public static final int PASSWORD_LENGTH = 8;

public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");

        // Taking input
        String password = sc.nextLine();

        if (is_Valid_Password(password)) {
            System.out.println("Password is valid: " + password);
        } else {
            System.out.println("Not a valid password: " + password);
        }

    }

    // Method to check password is strong or not
    public static boolean is_Valid_Password(String password) {

        if (password.length() < PASSWORD_LENGTH) return false;

        int charLowerCount = 0;
        int charUpperCount = 0;
        int numCount = 0;
        int specialCharCount = 0;

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_LetterLower(ch)) charLowerCount++;
            else if (is_LetterUpper(ch)) charUpperCount++;
            else if (is_Special(ch)) specialCharCount++;
            else return false;
        }


        return (charLowerCount >=1 && charUpperCount >=1 && numCount >=1 && specialCharCount >=1);
    }

    public static boolean is_LetterLower(char ch) {
        return (ch >= 'a' && ch <= 'z');
    }

    public static boolean is_LetterUpper(char ch) {
        return (ch >= 'A' && ch <= 'Z');
    }


    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }

    public static boolean is_Special(char ch) {

        switch(ch) {
          case '!':
          case '@':
          case '#':
          case '$':
          case '%':
          case '^':
          case '&':
          case '*':
          case '(':
          case ')':
          case '-':
          case '+':
           return true;
          default :
           return false;
        }
    }
}
