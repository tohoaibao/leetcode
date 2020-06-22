
public class RotateImage {

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n/2; i++) {
            int[] temp = matrix[i];
            matrix[i] = matrix[n - i - 1];
            matrix[n - i - 1] = temp;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }

    private static void printMatrix(int[][] input) {
        int n = input.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf(input[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] input = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        new RotateImage().rotate(input);
        printMatrix(input);
    }
}
