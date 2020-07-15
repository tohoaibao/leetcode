
import java.util.Arrays;

class WiggleSortII {

    // https://leetcode.com/problems/wiggle-sort-ii/
    public void wiggleSort(int[] nums) {
        int[] numSorted = nums.clone();
        Arrays.sort(numSorted);
        int n = nums.length;
        int idx = n - 1;
        for (int i = 1; i < n; i+= 2) {
            nums[i] = numSorted[idx--];
        }
        for (int i = 0; i < n; i+=2) {
            nums[i] = numSorted[idx--];
        }
    }

    public static void main(String[] args) {
//        int[] nums = {1, 5, 1, 1, 6, 4};
//        int[] nums = {1,1,2,1,2,2,1}; // --> [1,2,1,2,1,2,1]
//        int[] nums = {1,3,2,2,3,1}; // --> [2,3,1,3,1,2]
        int[] nums = {4,5,5,6};
        new WiggleSortII().wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}