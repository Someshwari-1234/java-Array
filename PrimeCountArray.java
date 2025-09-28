public class PrimeCountArray {
    public static void main(String[] args) {
        int[] arr = {7, 4, 3, 5, 6, 7, 8};
        int count = 0;

        for (int num : arr) {
            if (isPrime(num)) {
                count++;
            }
        }

        System.out.println("Number of prime elements: " + count);
    }

    // helper function to check prime
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
