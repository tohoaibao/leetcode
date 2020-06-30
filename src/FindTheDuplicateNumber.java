public class FindTheDuplicateNumber {

    // https://leetcode.com/problems/find-the-duplicate-number/

    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        fast = 0;
        while (fast != slow) {
            fast = nums[fast];
            slow = nums[slow];
        }

        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,2};
        System.out.println(new FindTheDuplicateNumber().findDuplicate(nums));
    }
}
