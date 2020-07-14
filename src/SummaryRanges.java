import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SummaryRanges {

    // https://leetcode.com/problems/summary-ranges/
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        int n = nums.length;
        int start;
        for (int i = 0; i < n; i++) {
            start = nums[i];
            while (i + 1 < n && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
            if (start != nums[i]) {
                res.add(start + "->" + nums[i]);
            } else {
                res.add(String.valueOf(start));
            }

        }

        return res;
    }

    public static void main(String[] args) {
//        int[] nums = {0,2,3,4,6,8,9};
        int[] nums = {0,1,2,4,5,7};
        System.out.println(Arrays.toString(new SummaryRanges().summaryRanges(nums).toArray()));
    }
}