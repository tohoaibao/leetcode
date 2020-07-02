import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

    // https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0) {
                nums[val] = - nums[val];
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                ans.add(i + 1);
            }
        }

        return ans;
    }



    public static void main(String[] args) {
       int[] nums = {};
       System.out.println(Arrays.toString(new FindAllNumbersDisappearedInAnArray().findDisappearedNumbers(nums).toArray()));
    }
}
