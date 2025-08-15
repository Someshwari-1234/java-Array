import java.util.Scanner;

public class OddArrayNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Take array size from user
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();

        int[] arr = new int[size];

        // Take array elements from user
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        // Print odd numbers
        System.out.println("Odd numbers in the array are:");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }

        scan.close();
    }
}
