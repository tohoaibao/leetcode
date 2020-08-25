import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class IntervalListIntersections {

    // https://leetcode.com/problems/interval-list-intersections/
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> list = new ArrayList<>();
        int i = 0, j = 0;
        while (i < A.length && j < B.length) {
            int lo = Math.max(A[i][0], B[j][0]);
            int hi = Math.min(A[i][1], B[j][1]);
            if (lo <= hi) {
                list.add(new int[]{lo, hi});
            }
            if (A[i][1] < B[j][1]) {
                i++;
            } else {
                j++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        int[][] A = {{0,2},{5,10},{13,23},{24,25}}, B = {{1,5},{8,12},{15,24},{25,26}};
        int[][] ans = new IntervalListIntersections().intervalIntersection(A, B);
        for (int[] row : ans) {
            System.out.println(Arrays.toString(row));
        }
    }
}