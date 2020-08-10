import java.util.Arrays;

class ReorderedPowerOf2 {

    // https://leetcode.com/problems/reordered-power-of-2/
    public boolean reorderedPowerOf2(int N) {
        int[] A = count(N);
        for (int i = 0; i < 31; i++) {
            // 1 << i = 2^i
            if (Arrays.equals(A, count(1 << i))) {
                return true;
            }
        }
        return false;
    }

    public int[] count(int N) {
        int[] ans = new int[10];
        while (N > 0) {
            ans[N % 10]++;
            N /= 10;
        }
        return ans;
    }



    public static void main(String[] args) {
        int N = 218;
        System.out.println(new ReorderedPowerOf2().reorderedPowerOf2(N));
    }
}