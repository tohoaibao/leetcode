import java.util.Arrays;

class DiagonalTraverse {

    // https://leetcode.com/problems/diagonal-traverse/
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[0];
        int m = matrix.length; // number rows
        int n = matrix[0].length; // number columns
        int r = 0, c = 0;
        int[] arr = new int[m*n];
        for (int i = 0; i < m*n; i++) {
            arr[i] = matrix[r][c];
            if ((r + c) % 2 == 0) { // moving up
                if      (c == n - 1) { r++; }
                else if (r == 0)     { c++; }
                else            { r--; c++; }
            } else { // moving down
                if      (r == m - 1) { c++; }
                else if (c == 0)     { r++; }
                else            { r++; c--; }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[][] matrix = {{ 1, 2, 3 },
                         { 4, 5, 6 },
                         { 7, 8, 9 },
                         { 2, 1, 3 }};
        System.out.println(Arrays.toString(new DiagonalTraverse().findDiagonalOrder(matrix)));
    }
}