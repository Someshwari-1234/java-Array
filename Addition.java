import java.util.Arrays;
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get array size
        System.out.print("Enter the size of the arrays: ");
        int size = scan.nextInt();

        int[] a = new int[size];
        int[] b = new int[size];
        int[] c = new int[size];

        // Input elements for array a
        System.out.println("Enter elements for first array:");
        for (int i = 0; i < size; i++) {
            a[i] = scan.nextInt();
        }

        // Input elements for array b
        System.out.println("Enter elements for second array:");
        for (int i = 0; i < size; i++) {
            b[i] = scan.nextInt();
        }

        // Add arrays element-wise
        for (int i = 0; i < size; i++) {
            c[i] = a[i] + b[i];
        }

        // Print the result
        System.out.println("Sum of two arrays: " + Arrays.toString(c));

        scan.close();
    }
}
