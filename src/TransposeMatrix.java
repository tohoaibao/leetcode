import java.util.Arrays;

class TransposeMatrix {

    // https://leetcode.com/problems/transpose-matrix/
    public int[][] transpose(int[][] A) {
        int m = A.length;
        int n = A[0].length;
        int[][] B = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                B[j][i] = A[i][j];
            }
        }
        return B;
    }

    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
//        int[][] A = {{1,2,3},{4,5,6}};
        int[][] ans = new TransposeMatrix().transpose(A);
        for (int[] row : ans) {
            System.out.println(Arrays.toString(row));
        }
    }
}