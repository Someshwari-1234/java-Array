import java.util.Scanner;

public class EvenAddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        // Add only even numbers
        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        // Output sum of even numbers
        System.out.println("Sum of even numbers in array: " + sum);
    }
}
