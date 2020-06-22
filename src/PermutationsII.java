import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, new ArrayList<>(), result, new boolean[nums.length]);
        return result;
    }

    private void backtrack(int[] nums, List<Integer> tempList, List<List<Integer>> res, boolean used[]) {
        if (tempList.size() == nums.length) {
            res.add(new ArrayList<>(tempList));
        }

        for (int i = 0; i < nums.length; i++) {
            if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1])
                continue;
            used[i] = true;
            tempList.add(nums[i]);
            backtrack(nums, tempList, res, used);
            used[i] = false;
            tempList.remove(tempList.size() - 1);
        }
    }


    public static void main(String[] args) {
        int nums[] = {3,3,0,3};
        List<List<Integer>> result = new PermutationsII().permuteUnique(nums);
        for (List<Integer> list: result) {
            System.out.println(Arrays.toString(new List[]{list}));
        }
    }
}
