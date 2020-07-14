import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CombinationSum {

    // https://leetcode.com/problems/combination-sum/
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
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
            if (nums[i] <= remain) {
                tempList.add(nums[i]);
                backtrack(res, tempList, nums, remain - nums[i], i);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int candidates[] = {2,3,5};
        int target = 8;
        List<List<Integer>> res = new CombinationSum().combinationSum(candidates, target);
        for (List<Integer> lst : res) {
            System.out.println(Arrays.toString(lst.toArray()));
        }
    }
}