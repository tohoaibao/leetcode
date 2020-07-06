class UglyNumberII {

    public int nthUglyNumber(int n) {
        int[] A = new int[n];
        A[0] = 1;
        int index2 = 0, index3 = 0, index5 = 0;
        int factor2 = 2, factor3 = 3, factor5 = 5;
        for (int i = 1; i < n; i++) {
            int min = Math.min(Math.min(factor2, factor3), factor5);
            A[i] = min;
            if (factor2 == min) {
                factor2 = 2*A[++index2];
            }
            if (factor3 == min) {
                factor3 = 3*A[++index3];
            }
            if (factor5 == min) {
                factor5 = 5*A[++index5];
            }
        }

        return A[n - 1];
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(new UglyNumberII().nthUglyNumber(n));
    }
}