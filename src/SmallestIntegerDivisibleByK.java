class SmallestIntegerDivisibleByK {

    // https://leetcode.com/problems/smallest-integer-divisible-by-k/
    public int smallestRepunitDivByK(int K) {
        if (K % 2 == 0 || K % 5 == 0) return -1;
        int r = 0;
        for (int i = 1; i <= K; ++i) {
            r = (r * 10 + 1) % K;
            if (r == 0) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int k = 23;//22
//        k = 2;
        System.out.println(new SmallestIntegerDivisibleByK().smallestRepunitDivByK(k));
    }
}