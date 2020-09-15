import java.util.Arrays;

class XORQueriesOfASubarray {

    // https://leetcode.com/problems/xor-queries-of-a-subarray/
    // xor[4..10] = xor[0..10]^xor[0..3]
    // xor[l..r] = xor[0..r]^xor[0..l-1] = pre[r + 1]^pre[l]
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] ret = new int[queries.length];
        int[] prefixXor = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            prefixXor[i + 1] = prefixXor[i] ^ arr[i ];
        }

        int i = 0;
        for (int[] q : queries) {
            ret[i++] = prefixXor[q[1] + 1] ^ prefixXor[q[0]];
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] A = {1,3,4,8};
        int[][] q = {{0,1},{1,2},{0,3},{3,3}};
//        int[] A = {4,8,2,10};
//        int[][] q = {{2,3},{1,3},{0,0},{0,3}};
        System.out.println(Arrays.toString(new XORQueriesOfASubarray().xorQueries(A, q)));
        System.out.println(3^5^3);
    }
}