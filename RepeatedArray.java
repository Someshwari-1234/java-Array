public class RepeatedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;

        // New array of double size
        int[] result = new int[2 * n];

        // Copy original array twice
        for (int i = 0; i < n; i++) {
            result[i] = arr[i];       // first copy
            result[i + n] = arr[i];   // second copy
        }

        // Print result
        System.out.print("Repeated Array: ");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
