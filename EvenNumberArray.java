import java.util.Scanner;

public class EvenNumbersArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array size from user
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Taking array elements from user
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Printing only even numbers
        System.out.println("Even numbers in the array:");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        
        sc.close();
    }
}
