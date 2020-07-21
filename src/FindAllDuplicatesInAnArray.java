import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FindAllDuplicatesInAnArray {

    // https://leetcode.com/problems/find-all-duplicates-in-an-array/
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]);
            if (nums[val - 1] < 0) {
                ans.add(val);
            } else {
                nums[val - 1] *= -1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(new FindAllDuplicatesInAnArray().findDuplicates(nums).toArray()));
    }
}