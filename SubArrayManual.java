class SubArrayManual {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int start = 1, end = 3; // subarray from index 1 to 2
        int[] subArr = new int[end - start];

        for (int i = start; i < end; i++) {
            subArr[i - start] = arr[i];
        }

        // Print subarray
        for (int num : subArr) {
            System.out.print(num + " ");
        }
    }
}
