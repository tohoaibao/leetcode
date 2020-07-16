import java.util.*;

class IntersectionOfTwoArraysII {

    // https://leetcode.com/problems/intersection-of-two-arrays-ii/
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> lst = new ArrayList<>();
        for (int num : nums2) {
            if (map.get(num) != null && map.get(num) > 0) {
                lst.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        int n = lst.size();
        int[] ret = new int[n];
        for (int i = 0; i < n; i++) {
            ret[i] = lst.get(i);
        }

        return ret;
    }

    // Sorting
    public int[] intersect2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = nums1.length, m = nums2.length;
        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();
        while (i < n && j < m) {
            int a = nums1[i], b = nums2[j];
            if (a == b) {
                list.add(a);
                i++;
                j++;
            } else if (a < b) {
                i++;
            } else {
                j++;
            }
        }

        int[] ret = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            ret[k] = list.get(k);
        }

        return ret;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(new IntersectionOfTwoArraysII().intersect(nums1, nums2)));
    }
}