class ReverseMergeArray {
    public static void main(String[] args) {
        // First array
        int[] arr1 = {1, 2, 3, 4};
        // Second array
        int[] arr2 = {5, 6, 7, 8};

        // Create merged array
        int[] merged = new int[arr1.length + arr2.length];

        // Copy elements from arr1
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        // Copy elements from arr2
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        // Print merged array in reverse
        System.out.println("Reverse Merged Array:");
        for (int i = merged.length - 1; i >= 0; i--) {
            System.out.print(merged[i] + " ");
        }
    }
}
