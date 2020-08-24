import java.util.Arrays;

class MinimumIncrementToMakeArrayUnique {
    // https://leetcode.com/problems/minimum-increment-to-make-array-unique/
    public int minIncrementForUnique(int[] A) {
        if (A==null || A.length == 0) return 0;
        Arrays.sort(A);
        int ans = 0, prev = A[0];
        for (int i = 1; i < A.length; ++i) {
            int expect = prev + 1;
            ans += A[i] > expect ? 0 : expect - A[i];
            prev = Math.max(expect, A[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {3,2,1,2,1,7};
        System.out.println(new MinimumIncrementToMakeArrayUnique().minIncrementForUnique(A));
    }
}