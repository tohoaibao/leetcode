
class GreatestSumDivisibleByThree {

    // https://leetcode.com/problems/greatest-sum-divisible-by-three/
    public int maxSumDivThree(int[] nums) {
        int[] dp = new int[]{0, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int a : nums) {
            int[] dp2 = new int[3];
            for (int i = 0; i < 3; ++i) {
                dp2[(i + a) % 3] = Math.max(dp[(i + a) % 3], dp[i] + a);
            }
            dp = dp2;
        }
        return dp[0];
    }

    public static void main(String[] args) {
        int[] A = {3,6,5,1,8};
        System.out.println(new GreatestSumDivisibleByThree().maxSumDivThree(A));
    }
}