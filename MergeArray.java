class MergeArray {
    public static void main(String[] args) {
        // First array
        int[] arr1 = {1, 3, 5, 7};
        // Second array
        int[] arr2 = {2, 4, 6, 8};

        // Create result array with combined size
        int[] merged = new int[arr1.length + arr2.length];

        // Copy elements of arr1
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        // Copy elements of arr2
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        // Print merged array
        System.out.println("Merged Array:");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}
