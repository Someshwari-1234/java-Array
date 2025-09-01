import java.util.*;

public class UniqueNumber {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 5, 6, 2, 8, 9};

        boolean[] visited = new boolean[arr.length];

        System.out.println("Unique numbers are:");
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            if (count == 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
