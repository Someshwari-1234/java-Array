class MissingRepeating {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        int n = arr.length;
        boolean[] visited = new boolean[n + 1];

        for (int num : arr) {
            if (visited[num]) {
                System.out.println("Repeating = " + num);
            }
            visited[num] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                System.out.println("Missing = " + i);
            }
        }
    }
}
