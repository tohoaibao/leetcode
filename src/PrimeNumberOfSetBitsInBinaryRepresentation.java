
class PrimeNumberOfSetBitsInBinaryRepresentation {

    // https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/
    public int countPrimeSetBits(int L, int R) {
        int count = 0;
        for (int i = L; i <= R; i++) {
            if (isPrime(Integer.bitCount(i))) {
                count++;
            }
        }
        return count;
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int L = 665988, R = 669533;
        System.out.println(new PrimeNumberOfSetBitsInBinaryRepresentation().countPrimeSetBits(L, R));
    }
}