import java.util.Arrays;

class ArrayPartitionI {

    // https://leetcode.com/problems/array-partition-i/
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i += 2) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1,4,3,2};
        System.out.println(new ArrayPartitionI().arrayPairSum(nums));
    }
}