import java.util.Arrays;

class SumOfEvenNumbersAfterQueries {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] ans = new int[queries.length];
        int sumEvens=0;
        for (int x : A) {
            if (x%2==0) sumEvens+=x;
        }
        int i = 0;
        for (int[] q : queries) {
            int val = q[0];
            int idx = q[1];
            if (A[idx]%2==0) {
                sumEvens-=A[idx];
            }
            A[idx] += val;
            if (A[idx]%2==0) {
                sumEvens+=A[idx];
            }
            ans[i++]=sumEvens;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4};
        int[][] queries = {{1,0},{-3,1},{-4,0},{2,3}};
        System.out.println(Arrays.toString(new SumOfEvenNumbersAfterQueries().sumEvenAfterQueries(A, queries)));
    }
}