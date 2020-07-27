
class MaximumProductOfThreeNumbers {
    public int maximumProduct(int[] nums) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }

            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }
        }

        return Math.max(max1*max2*max3, min1*min2*max1);
    }

    public static void main(String[] args) {
//        int[] nums = {0,0,0};
        int[] nums = {-4,-3,-2,-1,60};
        System.out.println(new MaximumProductOfThreeNumbers().maximumProduct(nums));
    }
}