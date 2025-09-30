package arraysexamples;

public class CountArrayFrequency {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 2, 4, 2, 7};

        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }
}
