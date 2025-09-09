public class ReverseCopy {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = new int[arr1.length];  // same size

        // Copy in reverse order
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[arr1.length - 1 - i];
        }

        // Print copied array
        System.out.print("Reverse Copied Array: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}
