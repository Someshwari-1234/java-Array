public class AlternateArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};

        System.out.print("Even index elements: ");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nOdd index elements: ");
        for (int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
