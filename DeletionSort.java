import java.util.ArrayList;
import java.util.Arrays;

public class DeletionSort {
    public static void main(String[] args) {
        int[] arr = {7, 3, 9, 1};
        int[] sorted = deletionSort(arr);
        System.out.println(Arrays.toString(sorted));
    }

    public static int[] deletionSort(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        int[] result = new int[arr.length];
        int index = 0;

        while (!list.isEmpty()) {
            // Find minimum
            int min = list.get(0);
            int minIndex = 0;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) < min) {
                    min = list.get(i);
                    minIndex = i;
                }
            }
            // Delete and store
            result[index++] = min;
            list.remove(minIndex);
        }

        return result;
    }
}
