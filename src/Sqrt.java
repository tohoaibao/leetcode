public class Sqrt {

    // https://leetcode.com/problems/sqrtx/
    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }

    public static void main(String[] args) {
        int x = 4;
        System.out.println(new Sqrt().mySqrt(x));
    }
}
