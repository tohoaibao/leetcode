import java.util.Arrays;

class FloodFill {

    // https://leetcode.com/problems/flood-fill/
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color != newColor) {
            dfs(image, sr, sc, color, newColor);
        }
        return image;
    }

    private void dfs(int[][] image, int r, int c, int color, int newColor) {
        if (image[r][c] == color) {
            image[r][c] = newColor;
            if (r >= 1) dfs(image, r - 1, c, color, newColor);
            if (c >= 1) dfs(image, r, c - 1, color, newColor);
            if (r + 1 < image.length) dfs(image, r + 1, c, color, newColor);
            if (c + 1 < image[0].length) dfs(image, r, c + 1, color, newColor);
        }
    }

    public static void main(String[] args) {
//        int[][] A = {{1,1,1},{1,1,0},{1,0,1}};
//        int sr = 1, sc = 1, newColor = 2;

        int[][] A = {{0,0,0},{1,0,0}};
        int sr = 1, sc = 0, newColor = 2;

        int[][] res = new FloodFill().floodFill(A, sr, sc, newColor);
        for (int[] row: res) {
            System.out.println(Arrays.toString(row));
        }
    }
}