import java.util.Arrays;

public class MinimumPathSum {

    // https://leetcode.com/problems/minimum-path-sum/
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 1; i < n; i++) {
            grid[0][i] += grid[0][i - 1];
        }

        for (int i = 1; i < m; i++) {
            grid[i][0] += grid[i - 1][0];
            for (int j = 1; j < n; j++) {
                grid[i][j] += Math.min(grid[i][j - 1], grid[i - 1][j]);
            }
        }

        return grid[m-1][n-1];
    }

    private static void printArrays(int[][] grid) {
        for (int[] row: grid) {
            System.out.println(Arrays.toString(row));
        }
    }


    public static void main(String[] args) {
        int[][] grid = {
                {1,3,1},
                {1,5,1},
                {4,2,1}};
        System.out.println(new MinimumPathSum().minPathSum(grid));
    }
}
