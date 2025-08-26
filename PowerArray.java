import java.util.Scanner;

public class PowerArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exp = sc.nextInt();

        // Create an array to hold multiplication results
        int[] arr = new int[exp + 1];

        arr[0] = 1; // base^0 = 1

        // Fill array with powers
        for (int i = 1; i <= exp; i++) {
            arr[i] = arr[i - 1] * base;  // multiply previous result by base
        }

        // Print step-by-step results
        System.out.println("Powers of " + base + ": ");
        for (int i = 0; i <= exp; i++) {
            System.out.println(base + "^" + i + " = " + arr[i]);
        }

        // Final answer
        System.out.println("\nFinal Answer: " + base + "^" + exp + " = " + arr[exp]);
    }
}
