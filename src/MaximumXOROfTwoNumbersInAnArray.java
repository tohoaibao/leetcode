import java.util.HashSet;
import java.util.Set;

class MaximumXOROfTwoNumbersInAnArray {

    // https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/
    public int findMaximumXOR(int[] nums) {
        int max = 0, mask = 0;
        for (int i = 31; i >= 0; i--) {
            mask = mask | (1 << i);
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num & mask);
            }
            int tmp = max | (1 << i);
            for (int prefix : set) {
                if (set.contains(tmp ^ prefix)) {
                    max = tmp;
                    break;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(new MaximumXOROfTwoNumbersInAnArray().findMaximumXOR(nums));;
    }
}