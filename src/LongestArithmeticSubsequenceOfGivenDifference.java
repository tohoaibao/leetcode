import java.util.HashMap;
import java.util.Map;

class LongestArithmeticSubsequenceOfGivenDifference {

    // https://leetcode.com/problems/longest-arithmetic-subsequence-of-given-difference/
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> dp = new HashMap<>();
        int ans = 0;
        for (int a : arr) {
            dp.put(a, dp.getOrDefault(a-difference, 0) + 1);
            ans = Math.max(ans, dp.get(a));
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1,5,7,8,5,3,4,2,1};
        int diff = -2;
        System.out.println(new LongestArithmeticSubsequenceOfGivenDifference().longestSubsequence(A, diff));
    }
}