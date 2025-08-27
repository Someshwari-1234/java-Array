import java.util.Scanner;

public class FactorialArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n+1];
        arr[0] = 1;  // 0! = 1

        for(int i = 1; i <= n; i++) {
            arr[i] = arr[i-1] * i;
        }

        System.out.println("Factorial of " + n + " is: " + arr[n]);
    }
}
