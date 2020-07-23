class FibonacciNumber {

    // https://leetcode.com/problems/fibonacci-number/
    public int fib(int N) {
        if (N <= 1) return N;
        int[] F = new int[N + 1];
        F[0] = 0;
        F[1] = 1;
        for (int i = 2; i <= N; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }

        return F[N];
    }

    public static void main(String[] args) {
        int N = 20;
        System.out.println(new FibonacciNumber().fib(N));
    }
}