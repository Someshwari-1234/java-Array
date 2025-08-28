import java.util.Scanner;

public class FibonacciArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many terms you want: ");
        int n = sc.nextInt();

        int[] fib = new int[n];

        // first two terms
        fib[0] = 0;
        if (n > 1) {
            fib[1] = 1;
        }

        // generate fibonacci numbers
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // print series
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}
