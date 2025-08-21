import java.util.HashMap;
import java.util.Scanner;

public class FrequencyOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Store frequency using HashMap
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Print frequencies
        System.out.println("Frequency of each number:");
        for (int key : freq.keySet()) {
            System.out.println(key + " → " + freq.get(key));
        }

        sc.close();
    }
}
