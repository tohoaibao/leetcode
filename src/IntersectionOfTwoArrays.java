import java.util.*;

class IntersectionOfTwoArrays {

    // https://leetcode.com/problems/intersection-of-two-arrays/
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }

        List<Integer> lst = new ArrayList<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                lst.add(num);
                set.remove(num);
            }
        }
        int n = lst.size();
        int[] ret = new int[n];
        for (int i = 0; i < n; i++) {
            ret[i] = lst.get(i);
        }

        return ret;
    }

    public static void main(String[] args) {
//        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(new IntersectionOfTwoArrays().intersection(nums1, nums2)));
    }
}