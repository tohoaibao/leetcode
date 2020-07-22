import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class NextGreaterElementI {

    // https://leetcode.com/problems/next-greater-element-i/
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        int n = nums1.length;
        for (int i = 0; i < n; i++) {
            nums1[i] = map.getOrDefault(nums1[i], -1);
        }

        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,1,2}, nums2 = {1,3,4,2};
//        int[] nums1 = {2,4}, nums2 = {1,2,3,4};

        System.out.println(Arrays.toString(new NextGreaterElementI().nextGreaterElement(nums1, nums2)));
    }
}