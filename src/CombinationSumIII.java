import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CombinationSumIII {

    // https://leetcode.com/problems/combination-sum-iii/
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), n, 1, k);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> tempList, int remain, int start, int k) {
        if (tempList.size() > k) return;
        if (remain == 0 && tempList.size() == k) {
            res.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = start; i <= 9; i++) {
            if (i <= remain) {
                tempList.add(i);
                backtrack(res, tempList, remain - i, i + 1, k);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int k = 3;
        int n = 12;
        List<List<Integer>> res = new CombinationSumIII().combinationSum3(k, n);
        for (List<Integer> lst : res) {
            System.out.println(Arrays.toString(lst.toArray()));
        }
    }
}