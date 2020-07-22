import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class RelativeRanks {

    // https://leetcode.com/problems/relative-ranks/
    public String[] findRelativeRanks(int[] nums) {
        int[] numCopys = nums.clone();
        Arrays.sort(numCopys);
        int n = nums.length;
        Map<Integer, String> map = new HashMap<>();
        int rank = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (rank == 1) {
                map.put(numCopys[i], "Gold Medal");
                rank++;
            } else if (rank == 2) {
                map.put(numCopys[i], "Silver Medal");
                rank++;
            } else if (rank == 3) {
                map.put(numCopys[i], "Bronze Medal");
                rank++;
            } else {
                map.put(numCopys[i], String.valueOf(rank++));
            }
        }

        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = map.get(nums[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,7,4};
        System.out.println(Arrays.toString(new RelativeRanks().findRelativeRanks(nums)));
    }
}