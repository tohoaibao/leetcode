import java.util.HashMap;
import java.util.Map;

class KDiffPairsInAnArray {

    // https://leetcode.com/problems/k-diff-pairs-in-an-array/
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (int key : map.keySet()) {
            if (k == 0) {
                //count how many elements in the array that appear more than twice
                if (map.get(key) >= 2) {
                    count++;
                }
            } else if (map.containsKey(key + k)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,1,5,4};
        int k = 0;
        System.out.println(new KDiffPairsInAnArray().findPairs(nums, k));
    }
}