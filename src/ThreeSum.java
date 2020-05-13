import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        int n = nums.length;
        int lo = 0, hi = 0, sum = 0, num = 0;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]){
                //don't find if same, avoid duplicate set
                continue;
            }

            num = nums[i];
            if (num > 0) {
                //we won't be able to find a value in the remainder
                //that will sum a positive to 0 since it's ordered
                break;
            }

            lo = i + 1;
            hi = n - 1;
            sum = 0 - num;
            // for each i, find the lo and hi which will meet the sum - there can be many
            while (lo < hi) {
                if (nums[lo] + nums[hi] == sum) {
                    result.add(Arrays.asList(num, nums[lo], nums[hi]));

                    //this allows us to avoid duplicate's on the left
                    while (lo < hi && nums[lo]==nums[lo+1]) lo++;

                    //avoid duplicates on the right
                    while (lo < hi && nums[hi]==nums[hi-1]) hi--;

                    //close the range
                    lo++;
                    hi--;
                } else if (nums[lo] + nums[hi] < sum) {
                    lo++;
                } else {
                    hi--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = new ThreeSum().threeSum(nums);
        System.out.println();
    }
}
