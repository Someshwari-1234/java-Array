import java.util.Arrays;

public class MergeAtIndex {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {100, 200, 300};
        int index = 2;  // Position where arr2 should be inserted

        // New array size = arr1 + arr2
        int[] result = new int[arr1.length + arr2.length];

        int k = 0;

        // Copy elements from arr1 before index
        for (int i = 0; i < index; i++) {
            result[k++] = arr1[i];
        }

        // Copy all elements from arr2
        for (int i = 0; i < arr2.length; i++) {
            result[k++] = arr2[i];
        }

        // Copy remaining elements from arr1 after index
        for (int i = index; i < arr1.length; i++) {
            result[k++] = arr1[i];
        }

        // Print result
        System.out.println(Arrays.toString(result));
    }
}
