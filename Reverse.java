public class Reverse {
    public static void main(String[] args) {
        String org = "Hello, World!";
        String Rev = "";

        for (int i = org.length() - 1; i >= 0; i--) {
            Rev += org.charAt(i);
        }

        System.out.println("Original string: " + org);
        System.out.println("Reversed string: " + Rev);
    }
}
