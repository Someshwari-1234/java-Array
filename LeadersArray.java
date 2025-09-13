public class LeadersArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        int maxRight = arr[n - 1];

        System.out.print("Leaders: " + maxRight + " ");
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxRight) {
                maxRight = arr[i];
                System.out.print(maxRight + " ");
            }
        }
    }
}
