import java.util.Scanner;

public class HCFArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find HCF of array
        int hcf = arr[0];
        for (int i = 1; i < n; i++) {
            hcf = findHCF(hcf, arr[i]);
        }

        // Output result
        System.out.println("HCF of array elements is: " + hcf);

        sc.close();
    }

    // Function to calculate HCF of two numbers
    public static int findHCF(int a, i
