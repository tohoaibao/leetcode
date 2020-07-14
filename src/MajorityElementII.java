import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MajorityElementII {

    // https://leetcode.com/problems/majority-element-ii/
    // https://gregable.com/2013/10/majority-vote-algorithm-find-majority.html
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        int n = nums.length;

        int count1 = 0, count2 = 0, first = 0, second = 0;
        for (int num : nums) {
            if (num == first) {
                count1++;
            } else if (num == second) {
                count2++;
            } else if (count1 == 0) {
                first = num;
                count1++;
            } else if (count2 == 0) {
                second = num;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == first) count1++;
            else if (num == second) count2++;
        }
        if (count1 > n/3) res.add(first);
        if (count2 > n/3) res.add(second);

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,2,2,2};
        System.out.println(Arrays.toString(new MajorityElementII().majorityElement(nums).toArray()));
    }
}