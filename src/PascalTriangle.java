import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {

    // https://leetcode.com/problems/pascals-triangle/
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> allrows = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            row.add(0,1);
            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
            allrows.add(new ArrayList<>(row));
        }
        return allrows;
    }



    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = new PascalTriangle().generate(5);
        for (List<Integer> sub : ans) {
            System.out.println(Arrays.toString(sub.toArray()));
        }
    }
}
