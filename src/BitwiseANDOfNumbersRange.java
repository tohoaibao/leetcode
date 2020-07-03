
public class BitwiseANDOfNumbersRange {

    // https://leetcode.com/problems/bitwise-and-of-numbers-range/
    public int rangeBitwiseAnd(int m, int n) {
        if (m == 0) return 0;
        // i means we have how many bits are 0 on the right
        int i = 0;
        while (m != n) {
            m >>= 1;
            n >>= 1;
            i++;
        }
        return m << i;
    }

    public static void main(String[] args) {
        int m = 5;
        int n = 7;
        System.out.println(new BitwiseANDOfNumbersRange().rangeBitwiseAnd(m, n));
    }
}
