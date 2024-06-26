import java.util.Scanner;

public class ATMBalanceCalculator {

    public static void main(S tring[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] denominations = {2000, 500, 200, 100};
        int[] numberOfNotes = new int[denominations.length];
        
        for (int i = 0; i < denominations.length; i++) {
            System.out.print("Enter the number of " + denominations[i] + " notes: ");
            numberOfNotes[i] = scanner.nextInt();
        }

        int totalBalance = calculateTotalBalance(denominations, numberOfNotes);
        System.out.println("Total available balance in the ATM is: " + totalBalance);
        scanner.close();
    }

    public static int calculateTotalBalance(int[] denominations, int[] numberOfNotes) {
        int total = 0;
        for (int i = 0; i < denominations.length; i++) {
            total += denominations[i] * numberOfNotes[i];
        }
        return total;
    }
}
