import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, result);
        return result;
    }

    private void backtrack(int[] nums, int start, List<List<Integer>> res) {
        if (start == nums.length) {
            List<Integer> r = new ArrayList<>();
            for (int elem : nums) {
                r.add(elem);
            }
            res.add(r);
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            backtrack(nums, start + 1, res);
            swap(nums, start, i);
        }
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3};
        List<List<Integer>> result = new Solution().permute(nums);
        for (List<Integer> list: result) {
            System.out.println(Arrays.toString(new List[]{list}));
        }
    }
}
