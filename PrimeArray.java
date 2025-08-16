import java.util.Scanner;

public class PrimeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array size
        System.out.print("Enter size of array: ");
        int num = sc.nextInt();

        int[] arr = new int[num];

        // Taking array input
        System.out.println("Enter " + num + " numbers:");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Prime numbers in the array are:");
        for (int i = 0; i < num; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    // Method to check prime number
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0, 1, and negative numbers are not prime
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
