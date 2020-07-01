public class SearchA2DMatrix {

    // https://leetcode.com/problems/search-a-2d-matrix/
    /*
        m * n matrix convert to an array => matrix[x][y] => a[x * n + y]
        an array convert to m * n matrix => a[x] =>matrix[x / n][x % n];
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m*n - 1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (matrix[mid/n][mid%n] == target) {
                return true;
            } else if (matrix[mid/n][mid%n] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,   3,  5,  7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}};
        int target = 16;
        System.out.println(new SearchA2DMatrix().searchMatrix(matrix, target));
    }
}
