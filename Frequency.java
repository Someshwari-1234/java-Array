import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 5, 6, 2, 8, 8, 6, 9}; // example input

        // To keep track of visited elements
        boolean[] visited = new boolean[arr.length];

        System.out.println("Number | Frequency");
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue; // skip already counted numbers

            int count = 1; 
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println("   " + arr[i] + "    |    " + count);
        }
    }
}
