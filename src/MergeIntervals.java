import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        // Sort by ascending starting point
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

        List<int[]> res = new ArrayList<>();
        int[] newInterval = intervals[0];
        res.add(newInterval);
        for (int[] interval: intervals) {
            // Overlapping intervals, move the end if needed
            if (interval[0] <= newInterval[1]) {
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {
                newInterval = interval;
                res.add(newInterval);
            }
        }

        return res.toArray(new int[res.size()][]);
    }


    public static void main(String[] args) {
        int[][] input = {{1,3},{2,6},{8,10},{15,18}};
        int[][] res = new MergeIntervals().merge(input);
        for (int[] item: res) {
            System.out.println(Arrays.toString(item));
        }
    }
}
