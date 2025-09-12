public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;  // rotate by 3
        int n = arr.length;
        k = k % n;

        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }

        for (int num : rotated) System.out.print(num + " ");
    }
}
