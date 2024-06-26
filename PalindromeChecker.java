import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        System.out.println(isPalindrome(input) ? "The string is a palindrome." : "The string is not a palindrome.");
        
        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
