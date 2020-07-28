class MaximumSwap {

    // https://leetcode.com/problems/maximum-swap/
    public int maximumSwap(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        int n = digits.length;
        for (int i = 0; i < n; i++) {
            int maxI = i + 1;
            boolean flag = false;
            for (int j = maxI; j < n; j++) {
                if (digits[j] > digits[i] && digits[j] >= digits[maxI]) {
                    maxI = j;
                    flag = true;
                }
            }
            if (flag) {
                // swap digits[i] vs digits[maxI]
                char tmp = digits[i];
                digits[i] = digits[maxI];
                digits[maxI] = tmp;
                return Integer.parseInt(String.valueOf(digits));
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