import java.util.Arrays;

class ReshapeTheMatrix {

    // https://leetcode.com/problems/reshape-the-matrix/
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] res = new int[r][c];
        int n = nums.length;
        int m = n != 0 ? nums[0].length : 0;
        if (m*n != r*c) return nums;

        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[k/c][k%c] = nums[i][j];
                k++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] nums = {{1,2},{3,4}};
        int r = 1, c = 4;
        int[][] res = new ReshapeTheMatrix().matrixReshape(nums, r, c);
        for (int[] rows : res) {
            System.out.println(Arrays.toString(rows));
        }
    }
}