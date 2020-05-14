public class RemoveDuplicatesFromSortedArrayII {

    public int removeDuplicates(int[] nums) {
        if (nums.length < 3) {
            return nums.length;
        }
        int p = 1, c = 1, i = 1;
        // p - filling counter, c - current integer occurrence
        while (i < nums.length) {
            if (c <= 2 && nums[i]==nums[i-1]) {
                c++;
                if (c <= 2) {
                    nums[p++] = nums[i];
                }
            } else if (nums[i] != nums[i - 1]) {
                c = 1;
                nums[p++] = nums[i];
            }
            i++;
        }

        return p;
    }

    public static void main(String[] args) {
        int nums[] = {1,1,1,2,2,3};
        int n = new RemoveDuplicatesFromSortedArrayII().removeDuplicates(nums);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
