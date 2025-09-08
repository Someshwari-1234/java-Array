public class OccurrenceArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 5, 6, 2, 8, 8, 6};
        int n = arr.length;

        boolean[] visited = new boolean[n]; // To mark counted elements

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue; // Skip already counted elements

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; // Mark as counted
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }
}
