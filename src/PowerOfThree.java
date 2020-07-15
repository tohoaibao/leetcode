class PowerOfThree {

    // https://leetcode.com/problems/power-of-three/
    public boolean isPowerOfThree(int n) {
        double x = Math.log10(n)/Math.log10(3);
        return x == (int) x;
//        return n > 0 && 1162261467 % n == 0;
    }

    public static void main(String[] args) {
        int n = 27;
//        n = 0;
//        n = 9;
//        n = 45;
        n = 243;
        System.out.println(new PowerOfThree().isPowerOfThree(n));
    }
}