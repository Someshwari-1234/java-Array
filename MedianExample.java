import java.util.Arrays;
import java.util.Scanner;

public class MedianExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        // Take array input
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Sort the array
        Arrays.sort(arr);
        
        double median;
        if (n % 2 == 1) {
            // Odd length → middle element
            median = arr[n / 2];
        } else {
            // Even length → average of two middle elements
            median = (arr[(n / 2) - 1] + arr[n / 2]) / 2.0;
        }
        
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Median = " + median);
        
        sc.close();
    }
}
