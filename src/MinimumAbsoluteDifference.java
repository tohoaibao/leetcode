import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; ++i) {
            int diff = arr[i+1] - arr[i];
            if (diff < minDiff) {
                minDiff = diff;
                ans.clear();
                ans.add(Arrays.asList(arr[i], arr[i+1]));
            } else if (diff==minDiff){
                ans.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }

        return ans;
    }

    public static void main(String[] args) {
//        int[] arr = {4,2,1,3};
        int[] arr = {3,8,-10,23,19,-4,-14,27};
        List<List<Integer>> ans = new MinimumAbsoluteDifference().minimumAbsDifference(arr);
        for (List<Integer> list : ans) {
            System.out.println(Arrays.toString(list.toArray()));
        }
    }
}