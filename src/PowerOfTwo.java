class PowerOfTwo {

    // https://leetcode.com/problems/power-of-two/
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return ((n & (n-1)) == 0);
    }

    public static void main(String[] args) {
        int n = 16;
        n = 218;
        n = 536870912;
        n = 17;
        System.out.println(new PowerOfTwo().isPowerOfTwo(n));
    }
}