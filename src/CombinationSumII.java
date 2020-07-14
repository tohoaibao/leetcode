import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CombinationSumII {

    // https://leetcode.com/problems/combination-sum/
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(res, new ArrayList<>(), candidates, target, 0);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> tempList, int[] nums, int remain, int start) {
        if (remain == 0) {
            res.add(new ArrayList<>(tempList));
        }
        for (int i = start; i < nums.length; i++) {
            if(i > start && nums[i] == nums[i-1]) continue; // skip duplicates
            if (nums[i] <= remain) {
                tempList.add(nums[i]);
                backtrack(res, tempList, nums, remain - nums[i], i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int candidates[] = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> res = new CombinationSumII().combinationSum2(candidates, target);
        System.out.println();
    }
}