public class HouseRobber {

    // https://leetcode.com/problems/house-robber/
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        int prev1 = 0;
        int prev2 = 0;
        for (int num : nums) {
            int temp = prev1;
            prev1 = Math.max(prev2 + num, prev1);
            prev2 = temp;
        }

        return prev1;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(new HouseRobber().rob(nums));
    }
}
