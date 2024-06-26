import java.util.Arrays;
import java.util.Scanner;

public class NthLargestinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        int N = 4;
        System.out.println(N + "th largest element in the array: " + array[size - N]);
        sc.close();
    }
}
