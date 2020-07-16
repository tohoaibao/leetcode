public class NumberOf1Bits {
    // https://leetcode.com/problems/number-of-1-bits/
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int sum = 0;
        while (n != 0) {
            sum++;
            n = n & (n - 1);
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println(new NumberOf1Bits().hammingWeight(n));
    }
}