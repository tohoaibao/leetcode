class PrimeArrangements {

    // https://leetcode.com/problems/prime-arrangements/
    public int numPrimeArrangements(int n) {
        int x = countPrimes(n);
        long ans = 1;
        int M = (int)(1e9+7);
        for (int i = 2; i <= x; ++i) {
            ans = (ans*i)%M;
        }
        for (int i = 2; i <= n - x; ++i) {
            ans = (ans*i)%M;
        }
        return (int)ans;
    }

    private int countPrimes(int n) {
        boolean[] notPrime = new boolean[n + 1];
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (!notPrime[i]) {
                count++;
                for (int j = 2; i * j <= n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println(new PrimeArrangements().numPrimeArrangements(n));
    }
}