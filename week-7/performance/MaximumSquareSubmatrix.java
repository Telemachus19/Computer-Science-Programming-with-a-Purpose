/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class MaximumSquareSubmatrix {
    // Returns the size of the largest contiguous square submatrix
    // of a[][] containing only 1s.
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println();
        }
    }

    public static int size(int[][] a) {
        int max = 0, rows = a.length, cols = a[0].length, min;
        int[][] dp = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = a[i][j];
                }
                else {
                    if (a[i][j] == 1) {
                        min = Math.min(dp[i - 1][j], dp[i][j - 1]);
                        dp[i][j] = Math.min(dp[i - 1][j - 1], min) + 1;
                        max = (dp[i][j] > max) ? dp[i][j] : max;
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int matrixSize = StdIn.readInt();
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = StdIn.readInt();
            }
        }
        int max = size(matrix);
        StdOut.println(max);
    }
}
