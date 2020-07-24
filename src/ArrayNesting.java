class ArrayNesting {
    public int arrayNesting(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i; nums[j] >= 0; count++) {
                int tmp = nums[j];
                nums[j] = -1; // mask nums[j] as visited
                j = tmp;
            }
            max = Math.max(max, count);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {5,4,0,3,1,6,2};
        System.out.println(new ArrayNesting().arrayNesting(nums));
    }
}