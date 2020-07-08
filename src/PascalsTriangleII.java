import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PascalsTriangleII {

    // https://leetcode.com/problems/pascals-triangle-ii/
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i - 1; j >= 1; j--) {
                int tmp = res.get(j - 1) + res.get(j);
                res.set(j, tmp);
            }
            res.add(1);
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(Arrays.toString(new PascalsTriangleII().getRow(n).toArray()));
    }
}