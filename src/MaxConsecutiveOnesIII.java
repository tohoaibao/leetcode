class MaxConsecutiveOnesIII {

    // https://leetcode.com/problems/max-consecutive-ones-iii/
    public int longestOnes(int[] A, int K) {
        // Sliding window
        int i = 0, j;
        for (j = 0; j < A.length; ++j) {
            if (A[j]==0) K--;
            if (K<0 && A[i++]==0) K++;
        }

        return j - i;
    }

    public static void main(String[] args) {
        int[] A = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int K = 3;
//        int[] A = {1,1,1,0,0,0,1,1,1,1,0};
//        int K = 2;
        System.out.println(new MaxConsecutiveOnesIII().longestOnes(A, K));
    }
}