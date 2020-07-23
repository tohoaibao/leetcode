import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MinimumTimeDifference {

    // https://leetcode.com/problems/minimum-time-difference/
    public int findMinDifference(List<String> timePoints) {
        int[] buckets = new int[24 * 60];
        int ans = 24 * 60, first = ans;
        for (String hhmm : timePoints) {
            int num = 60 * Integer.parseInt(hhmm.substring(0, 2));
            num += Integer.parseInt(hhmm.substring(3));
            first = Math.min(first, num);
            if (++buckets[num] > 1) return 0; // same bucket
        }
        int prev = first;
        for (int i = first + 1; i < buckets.length; ++i) {
            if (buckets[i] == 0) continue;
            ans = Math.min(ans, i - prev);
            prev = i;
        }
        return Math.min(ans, 24 * 60 + first - prev);
    }


    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("05:31","22:08","00:35"));//147
//        List<String> list = new ArrayList<>(Arrays.asList("23:59","00:00"));//1
//        List<String> list = new ArrayList<>(Arrays.asList("12:12","00:13"));//719

        System.out.println(new MinimumTimeDifference().findMinDifference(list));
    }
}