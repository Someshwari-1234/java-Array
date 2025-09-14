import java.util.Arrays;

public class ZigzagArray {
    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 8, 6, 2, 1};
        zigzag(arr);

        System.out.println("Zigzag Array: " + Arrays.toString(arr));
    }

    public static void zigzag(int[] arr) {
        boolean flag = true;  // true means "<" expected, false means ">" expected

        for (int i = 0; i < arr.length - 1; i++) {
            if (flag) {  // "<" relation expected
                if (arr[i] > arr[i + 1]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } else {  // ">" relation expected
                if (arr[i] < arr[i + 1]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            flag = !flag; // flip expectation for next pair
        }
    }
}
