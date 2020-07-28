class MaximumSwap {

    // https://leetcode.com/problems/maximum-swap/
    public int maximumSwap(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        int[] buckets = new int[10];
        int n = digits.length;
        for (int i = 0; i < n; i++) {
            buckets[digits[i] - '0'] = i;
        }

        for (int i = 0; i < n; i++) {
            for (int k = 9; k > digits[i] - '0'; k--) {
                if (buckets[k] > i) {
                    // swap digits[i] vs digits[buckets[k]]
                    char tmp = digits[i];
                    digits[i] = digits[buckets[k]];
                    digits[buckets[k]] = tmp;
                    return Integer.parseInt(String.valueOf(digits));
                }
            }
        }

        return num;
    }

    public static void main(String[] args) {
        int num = 2736;
//        num = 9973;
//        num = 98368;
        num = 1993;
        System.out.println(new MaximumSwap().maximumSwap(num));
    }
}