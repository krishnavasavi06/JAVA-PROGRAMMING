import java.util.Scanner;

public class SpecialCharacterCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a statement:");
        String statement = sc.nextLine();

        int specialCharCount = 0;

        for (int i = 0; i < statement.length(); i++) {
            char c = statement.charAt(i);
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                specialCharCount++;
            }
        }

        System.out.println("Number of special characters: " + specialCharCount);
        sc.close();
    }
}
