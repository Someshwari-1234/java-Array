public class FiboPrimeArray {

    // Function to check if number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 15;  // number of Fibonacci terms
        int[] fib = new int[n];

        // Generate Fibonacci series and store in array
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // Print Fibonacci numbers
        System.out.print("Fibonacci series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }

        // Print only prime Fibonacci numbers
        System.out.print("\nFiboPrime numbers: ");
        for (int i = 0; i < n; i++) {
            if (isPrime(fib[i])) {
                System.out.print(fib[i] + " ");
            }
        }
    }
}
