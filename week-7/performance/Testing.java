/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Testing {
    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrixSize = StdIn.readInt();
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = StdIn.readInt();
            }
        }
        System.out.println("Main matrix");
        printMatrix(matrix);
        int[][] dp = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = matrix[i][j];
                }
                if (i != 0 && j != 0 && matrix[i - 1][j] == 1 && matrix[i][j - 1] == 1
                        && matrix[i - 1][j - 1] == 1) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
            }
        }
        System.out.println("DP Matrix");
        printMatrix(dp);
    }
}
