class NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {
        int n = nums.length;
        int c = 0;
        for (int i = 1; i < n && c <= 1; i++) {
            if (nums[i-1] > nums[i]) {
                c++;
                if (i-2 < 0 || nums[i-2] <= nums[i]) nums[i-1] = nums[i];
                else  nums[i] = nums[i-1];
            }
        }

        return c <= 1;
    }

    public static void main(String[] args) {
//        int[] nums = {3,4,2,3};
        int[] nums = {-1,4,2,3};
        System.out.println(new NonDecreasingArray().checkPossibility(nums));
    }
}