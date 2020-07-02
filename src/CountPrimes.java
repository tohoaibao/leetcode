
public class CountPrimes {

    // https://leetcode.com/problems/count-primes/
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!notPrime[i]) {
                count++;
                for (int j = 2; i * j < n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }

        return count;
    }


    public static void main(String[] args) {
        int n = 10; // output 114155
        System.out.println(new CountPrimes().countPrimes(n));
    }
}
