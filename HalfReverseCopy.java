public class HalfReverseCopy {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int n = arr.length;
        int[] result = new int[n];

        // Copy first half as it is
        for (int i = 0; i < n / 2; i++) {
            result[i] = arr[i];
        }

        // Copy second half in reverse
        int j = n / 2;   // starting index for second half in result
        for (int i = n - 1; i >= n / 2; i--) {
            result[j] = arr[i];
            j++;
        }

        // Print result
        System.out.print("Half Reverse Copy: ");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
