import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        // Sample array
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

        // Array to store frequencies
        int[] count = new int[array.length];
        boolean[] visited = new boolean[array.length];

        // Initialize the visited array
        for (int i = 0; i < array.length; i++) {
            visited[i] = false;
        }

        // Count frequency of each element
        for (int i = 0; i < array.length; i++) {
            if (visited[i]) {
                continue;
            }

            int countElement = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    visited[j] = true;
                    countElement++;
                }
            }
            count[i] = countElement;
        }

        // Print the frequency of each element
        System.out.println("Element : Frequency");
        for (int i = 0; i < array.length; i++) {
            if (!visited[i]) {
                System.out.println(array[i] + " : " + count[i]);
            }
        }
    }
}
