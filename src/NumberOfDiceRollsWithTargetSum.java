
class NumberOfDiceRollsWithTargetSum {

    int dp[][] = new int[31][1001];
    public int numRollsToTarget(int d, int f, int target) {
        return numRollsToTarget(d, f, target, 0);
    }

    private int numRollsToTarget(int d, int f, int target, int res) {
        if (d == 0 && target == 0)
            return 1;
        if (d <= 0 || target <= 0)
            return 0;
        if (dp[d][target] != 0)
            return dp[d][target] - 1;

        for (int i = 1; i <= f; i++) {
            res = (res + numRollsToTarget(d-1,f, target - i)) % 1000000007;
        }
        dp[d][target] = res  + 1;

        return res;
    }

    public static void main(String[] args) {
        int d = 30, f = 30, target = 500;
        System.out.println(new NumberOfDiceRollsWithTargetSum().numRollsToTarget(d, f, target));
    }
}