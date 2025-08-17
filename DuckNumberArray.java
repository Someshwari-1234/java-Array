import java.util.Scanner;

public class DuckNumberArray {

    // Function to check if a number is Duck
    private static boolean isDuckNumber(int num) {
        // numbers like 0 or negative should not be considered duck
        if (num <= 0) return false;

        // check digits from last
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0) {
                return true; // found a zero (not leading)
            }
            num /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nDuck Numbers in the array are:");
        for (int num : arr) {
            // skip numbers starting with zero (like 0123, but as int it’s just 123)
            String str = String.valueOf(num);
            if (str.charAt(0) != '0' && isDuckNumber(num)) {
                System.out.println(num);
            }
        }

        sc.close();
    }
}
