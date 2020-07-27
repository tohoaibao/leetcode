class SumOfSquareNumbers {

    // https://leetcode.com/problems/sum-of-square-numbers/
    public boolean judgeSquareSum(int c) {
        for (int i = 0; i <= Math.sqrt(c); i++) {
            double x = Math.sqrt(c - i*i);
            if (x == (int)x) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int c = 12;
        System.out.println(new SumOfSquareNumbers().judgeSquareSum(c));
    }
}