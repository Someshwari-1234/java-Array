import java.util.Arrays;

public class SmallestRepeatingSubsequenceNumbers {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 1, 2, 1, 2};
        int[] arr2 = {5, 5, 5, 5};
        int[] arr3 = {1, 2, 3, 1, 2};

        System.out.println("Smallest repeating subsequence of arr1 → " + Arrays.toString(smallestRepeating(arr1)));
        System.out.println("Smallest repeating subsequence of arr2 → " + Arrays.toString(smallestRepeating(arr2)));
        System.out.println("Smallest repeating subsequence of arr3 → " + Arrays.toString(smallestRepeating(arr3)));
    }

    public static int[] smallestRepeating(int[] arr) {
        int n = arr.length;

        // Try every possible subsequence length
        for (int len = 1; len <= n / 2; len++) {
            if (n % len == 0) { // only if divisible

                // Extract pattern
                int[] pattern = new int[len];
                for (int i = 0; i < len; i++) {
                    pattern[i] = arr[i];
                }

                // Build repeated array
                int[] built = new int[n];
                int k = 0;
                for (int repeat = 0; repeat < n / len; repeat++) {
                    for (int j = 0; j < len; j++) {
                        built[k++] = pattern[j];
                    }
                }

                // Check if built == arr
                boolean match = true;
                for (int i = 0; i < n; i++) {
                    if (arr[i] != built[i]) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    return pattern;
                }
            }
        }

        // No repetition → return original array
        return arr;
    }
}
