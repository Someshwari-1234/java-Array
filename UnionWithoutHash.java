import java.util.Arrays;

public class UnionWithoutHash {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        // Step 1: Create a new array large enough to hold both arrays
        int[] temp = new int[arr1.length + arr2.length];
        int k = 0;

        // Step 2: Copy all elements of arr1
        for (int i = 0; i < arr1.length; i++) {
            temp[k++] = arr1[i];
        }

        // Step 3: Copy elements of arr2 that are not already in arr1
        for (int i = 0; i < arr2.length; i++) {
            boolean isPresent = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) {
                temp[k++] = arr2[i];
            }
        }

        // Step 4: Store only the union elements in a result array
        int[] union = Arrays.copyOf(temp, k);

        // Step 5: Print the result
        System.out.print("Union of arrays: ");
        for (int num : union) {
            System.out.print(num + " ");
        }
    }
}
