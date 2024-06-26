import java.util.Arrays;

public class NthMaxMin {

    public static void main(String[] args) {
        int[] array = {7, 2, 5, 3, 9, 1, 6, 4, 8}; // example array
        int n = 3; // example value for n

        int nthMax = findNthMax(array, n);
        int nthMin = findNthMin(array, n);

        System.out.println(n + "th Maximum number is: " + nthMax);
        System.out.println(n + "th Minimum number is: " + nthMin);

        int sum = nthMax + nthMin;
        int diff = nthMax - nthMin;

        System.out.println("Sum of " + n + "th max and min is: " + sum);
        System.out.println("Difference of " + n + "th max and min is: " + diff);
    }

    public static int findNthMax(int[] array, int n) {
        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);
        return sortedArray[sortedArray.length - n];
    }

    public static int findNthMin(int[] array, int n) {
        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);
        return sortedArray[n - 1];
    }
}
