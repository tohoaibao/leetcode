import java.util.Random;

class RandomPickIndex {

    // https://leetcode.com/problems/random-pick-index/
    int[] nums;
    Random random;
    public RandomPickIndex(int[] nums) {
        this.nums = nums;
        this.random = new Random();
    }

    public int pick(int target) {
        int res = -1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && random.nextInt(++count) == 0) {
                res = i;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,3,3};
        RandomPickIndex obj = new RandomPickIndex(nums);
        System.out.println(obj.pick(3));
        System.out.println(obj.pick(3));
//        System.out.println(obj.pick(1));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */