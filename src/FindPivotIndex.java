class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int sumLeft = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (sumLeft == sum - sumLeft - nums[i]) return i;
            sumLeft += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
//        int[] nums = {1,2,3};
        System.out.println(new FindPivotIndex().pivotIndex(nums));
    }
}