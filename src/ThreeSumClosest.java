
import java.util.Arrays;

public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int n = nums.length;
        int lo = 0, hi = 0, sum = 0;
        int absDiff = Integer.MAX_VALUE;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            lo = i + 1;
            hi = n - 1;
            while (lo < hi) {
                int diff = nums[i] + nums[lo] + nums[hi] - target;
                if (diff == 0) {
                    return target;
                } else if (diff < 0) {
                    lo++;
                } else {
                    hi--;
                }
                if (Math.abs(diff) < absDiff) {
                    absDiff = Math.abs(diff);
                    sum = diff + target;
                }
            }

        }

        return sum;
    }

    public static void main(String[] args) {
        int nums[] = {0, 1, 2};
        int target = 3;
        System.out.println(new ThreeSumClosest().threeSumClosest(nums, target));
    }
}
