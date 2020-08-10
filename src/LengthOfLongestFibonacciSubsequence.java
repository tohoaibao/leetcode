import java.util.HashSet;
import java.util.Set;

class LengthOfLongestFibonacciSubsequence {

    // https://leetcode.com/problems/length-of-longest-fibonacci-subsequence/
    public int lenLongestFibSubseq(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int e : A) {
            set.add(e);
        }
        int n = A.length;
        int ans = 2;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int x = A[i], y = A[j], length = 2;
                while (set.contains(x + y)) {
                    y = x + y;
                    x = y - x;
                    length++;
                }
                ans = Math.max(ans, length);
            }
        }

        return ans > 2 ? ans : 0;
    }

    public static void main(String[] args) {
//        int[] A = {1,3,7,11,12,14,18};
        int[] A = {1,3,5};
        System.out.println(new LengthOfLongestFibonacciSubsequence().lenLongestFibSubseq(A));
    }
}