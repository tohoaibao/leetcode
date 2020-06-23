import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] A = Arrays.copyOf(intervals, intervals.length + 1);
        A[intervals.length] = newInterval;

        Arrays.sort(A, (i1, i2) -> Integer.compare(i1[0], i2[0]));

        List<int[]> res = new ArrayList<>();
        int[] curInterval = A[0];
        res.add(curInterval);
        for (int[] interval: A) {
            if (interval[0] <= curInterval[1]) {
                curInterval[1] = Math.max(interval[1], curInterval[1]);
            } else {
                curInterval = interval;
                res.add(curInterval);
            }
        }

        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};
        int[][] res = new InsertInterval().insert(intervals, newInterval);
        for (int[] item: res) {
            System.out.println(Arrays.toString(item));
        }
    }
}
