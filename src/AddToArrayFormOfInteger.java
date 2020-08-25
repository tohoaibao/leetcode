import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class AddToArrayFormOfInteger {

    // https://leetcode.com/problems/add-to-array-form-of-integer/
    public List<Integer> addToArrayForm(int[] A, int K) {
        int N = A.length;
        int cur = K;
        List<Integer> ans = new ArrayList();

        int i = N;
        while (--i >= 0 || cur > 0) {
            if (i >= 0)
                cur += A[i];
            ans.add(cur % 10);
            cur /= 10;
        }

        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
//        int[] A = {9,9,9,9,9,9,9,9,9,9};
//        int K = 1;
        int[] A = {1,2,0,0};
        int K = 34;
//        int[] A = {0};
//        int K = 23;
        System.out.println(Arrays.toString(new AddToArrayFormOfInteger().addToArrayForm(A, K).toArray()));
    }
}