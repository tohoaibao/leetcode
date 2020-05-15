import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        if (nums == null || n < 4) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n - 2; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]){
                    continue;
                }
                int lo = j + 1;
                int hi = n - 1;
                while (lo < hi) {
                    int sum = nums[i] + nums[j] + nums[lo] + nums[hi];
                    if (sum <= target) {
                        if (sum == target) {
                            result.add(Arrays.asList(nums[i], nums[j], nums[lo], nums[hi]));
                        }
                        int val = nums[lo];
                        while (lo < hi && nums[lo]==val){
                            lo++;
                        }
                    } else {
                        int val = nums[hi];
                        while (lo < hi && nums[hi] == val){
                            hi--;
                        }
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> list = new FourSum().fourSum(nums, target);
        System.out.println();
    }
}
