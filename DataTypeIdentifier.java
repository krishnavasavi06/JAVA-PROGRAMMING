import java.util.Scanner;

public class DataTypeIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input:");
        String input = scanner.nextLine();
        System.out.println("Detected data type: " + detectDataType(input));
        scanner.close();
    }

    private static String detectDataType(String input) {
        if (isInteger(input)) {
            return "Integer";
        } else if (isDouble(input)) {
            return "Double";
        } else if (isBoolean(input)) {
            return "Boolean";
        } else {
            return "String";
        }
    }

    private static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isDouble(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isBoolean(String input) {
        return input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false");
    }
}
