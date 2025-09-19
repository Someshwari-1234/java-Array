public class Reverse2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        // Reverse each row
        for (int i = 0; i < rows; i++) {
            int start = 0, end = cols - 1;
            while (start < end) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }

        // Print result
        System.out.println("Row-Reversed 2D Array:");
        for (int[] row : arr) {
            for (int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
