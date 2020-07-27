import java.util.Arrays;

class MaximumLengthOfPairChain {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[1]-b[1]);
        int curr = Integer.MIN_VALUE;
        int ans = 0;
        for (int[] p : pairs) {
            if (curr < p[0]) {
                curr = p[1];
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        int[][] A = {{2,3},{1,2},{3,4},{7,8}};//2
//        int[][] A = {{-6,9},{1,6},{8,10},{-1,4},{-6,-2},{-9,8},{-5,3},{0,3}};//3
        int[][] A = {{7,9},{4,5},{7,9},{-7,-1},{0,10},{3,10},{3,6},{2,3}};//4
        System.out.println(new MaximumLengthOfPairChain().findLongestChain(A));
    }
}
