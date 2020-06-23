import java.util.Arrays;

public class SpiralMatrixII {

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int rowBegin = 0;
        int rowEnd = n - 1;
        int colBegin = 0;
        int colEnd = n - 1;
        int i = 1;
        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // Traverse right
            for (int j = colBegin; j <= colEnd; j++) {
                matrix[rowBegin][j] = i++;
            }
            rowBegin++;

            // Traverse down
            for (int j = rowBegin; j <= rowEnd; j++) {
                matrix[j][colEnd] = i++;
            }
            colEnd--;

            // Traverse left
            if (rowBegin <= rowEnd) {
                for (int j = colEnd; j >= colBegin; j--) {
                    matrix[rowEnd][j] = i++;
                }
                rowEnd--;
            }

            // Traverse up
            if (colBegin <= colEnd) {
                for (int j = rowEnd; j >= rowBegin; j--) {
                    matrix[j][colBegin] = i++;
                }
                colBegin++;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = new SpiralMatrixII().generateMatrix(n);
        for (int[] row: matrix) {
            System.out.println(Arrays.toString(row));
        }

    }
}
