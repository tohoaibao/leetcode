class MonotonicArray {

    // https://leetcode.com/problems/monotonic-array/
    public boolean isMonotonic(int[] A) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0; i < A.length - 1; ++i) {
            if (A[i] > A[i+1])
                increasing = false;
            if (A[i] < A[i+1])
                decreasing = false;
        }

        return increasing || decreasing;
    }

    public static void main(String[] args) {
//        int[] A = {1,2,2,3};
//        int[] A = {6,5,4,4};
//        int[] A = {1,3,2};
        int[] A = {1,2,3,4,5};
        System.out.println(new MonotonicArray().isMonotonic(A));
    }
}