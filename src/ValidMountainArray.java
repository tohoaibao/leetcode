class ValidMountainArray {

    // https://leetcode.com/problems/valid-mountain-array/
    public boolean validMountainArray(int[] A) {
        if (A.length < 3) return false;
        int n = A.length, left = 0, right = n - 1;
        while (left < n - 1 && A[left] < A[left + 1]) left++;
        while (right > 0 && A[right - 1] > A[right]) right--;
        return left > 0 && right < n - 1 && left == right;
    }

    public static void main(String[] args) {
        int[] A = {0, 2, 3, 4, 5, 2, 1, 0};
//        int[] A = {9,8,7,6,5,4,3,2,1,0};
//        int[] A = {2, 0, 2};
        System.out.println(new ValidMountainArray().validMountainArray(A));
    }
}