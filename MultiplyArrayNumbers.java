import java.util.Scanner;

public class MultiplyArrayNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to store 2 numbers
        int[] arr = new int[2];

        // Taking input
        System.out.print("Enter first number: ");
        arr[0] = sc.nextInt();

        System.out.print("Enter second number: ");
        arr[1] = sc.nextInt();

        // Multiplication
        int product = arr[0] * arr[1];

        // Output
        System.out.println("The product of " + arr[0] + " and " + arr[1] + " is: " + product);

        sc.close();
    }
}
