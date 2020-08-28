import java.util.Arrays;

class HeightChecker {
    // https://leetcode.com/problems/height-checker/
    public int heightChecker(int[] heights) {
        int ans = 0;
        int[] A = heights.clone();
        Arrays.sort(A);
        for (int i = 0; i < heights.length; ++i) {
            if (A[i]!=heights[i]) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1,1,4,2,1,3};
        System.out.println(new HeightChecker().heightChecker(A));
    }
}