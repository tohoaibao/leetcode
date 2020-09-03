class KConcatenationMaximumSum {

    // https://leetcode.com/problems/k-concatenation-maximum-sum/
    public int kConcatenationMaxSum(int[] arr, int k) {
        int M = (int)1e9+7, n = arr.length;
        long presum = 0, premax = 0;
        long sufsum = 0, sufmax = 0;
        long cursum = 0, curmax = 0;
        for (int i = 0; i < n; ++i) {
            // prefix sum
            presum += arr[i];
            premax = Math.max(premax, presum);

            // suffix sum
            sufsum += arr[n-i-1];
            sufmax = Math.max(sufmax, sufsum);

            //Kadane's Algorithm
            cursum = Math.max(0, cursum) + arr[i];
            curmax = Math.max(curmax, cursum);
        }

        long ans = Math.max(curmax, premax + sufmax + Math.max(0, presum*(k-2)));
        return (int)((k==1?curmax:ans)%M);
    }

    public static void main(String[] args) {
//        int[] arr = {1,2};
//        int k = 3;//9
        int[] arr = {1,-2,1};
        int k = 5;//2
        System.out.println(new KConcatenationMaximumSum().kConcatenationMaxSum(arr, k));
    }
}