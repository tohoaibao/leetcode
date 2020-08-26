import java.util.Arrays;

class MaximizeSumOfArrayAfterKNegations {

    // https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        for (int i = 0; i < A.length && K > 0 && A[i] < 0; ++i, --K) {
            A[i]=-A[i];
        }
        int ans = 0, min = Integer.MAX_VALUE;
        for (int a : A) {
            ans += a;
            min = Math.min(min, a);
        }

        return ans - (K%2)*min*2;
    }

    public static void main(String[] args) {
//        int[] A = {2,-3,-1,5,-4};
//        int K = 2;
//        int[] A = {3,-1,0,2};
//        int K = 3;
        int[] A = {4,2,3};
        int K = 1;
        System.out.println(new MaximizeSumOfArrayAfterKNegations().largestSumAfterKNegations(A, K));
    }
}