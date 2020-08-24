import java.util.Arrays;

class LargestPerimeterTriangle {

    // https://leetcode.com/problems/largest-perimeter-triangle/
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 3; i >= 0; i--) {
            if (A[i] + A[i + 1] > A[i + 2]) {
                return A[i] + A[i + 1] + A[i + 2];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] A = {3,6,2,3};
        System.out.println(new LargestPerimeterTriangle().largestPerimeter(A));
    }
}