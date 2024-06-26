import java.util.Scanner;

public class Upperlower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter characters (* to exit):");
        
        char c = '0';
        int lower = 0, upper = 0, digit = 0;
        
        while (c != '*') {
            c = input.next().charAt(0);
            if (c >= 'A' && c <= 'Z') {
                upper++;
            } else if (c >= 'a' && c <= 'z') {
                lower++;
            } else if (c >= '0' && c <= '9') {
                digit++;
            }
        }
        
        System.out.println("Lower: " + lower);
        System.out.println("Upper: " + upper);
        System.out.println("Digit: " + digit);

        input.close();
    }
}
