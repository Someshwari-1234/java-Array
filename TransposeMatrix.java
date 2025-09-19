public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4},{5, 6}};

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Transpose matrix has swapped dimensions
        int[][] transpose = new int[cols][rows];

        // Fill transpose
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print transpose
        System.out.println("Transpose Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
