class SumOfTwoIntegers {

    // https://leetcode.com/problems/sum-of-two-integers/
    public int getSum(int a, int b) {
        while(b != 0) {
            int carry = a&b;
            a = a^b;
            b = carry << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 2, b = 7;
        System.out.println(new SumOfTwoIntegers().getSum(a, b));
    }
}