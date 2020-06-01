import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SubsetsII {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(res, new ArrayList<>(), nums, 0);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> tempList, int[] nums, int start) {
        res.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            if(i > start && nums[i] == nums[i-1])
                continue; // skip duplicates
            tempList.add(nums[i]);
            backtrack(res, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,2,2};
        List<List<Integer>> res = new SubsetsII().subsetsWithDup(nums);
        System.out.println();
    }
}