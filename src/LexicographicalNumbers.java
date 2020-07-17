import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class LexicographicalNumbers {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>(n);
        for (int i = 1; i < 10; i++) {
            dfs(i, n, res);
        }
        return res;
    }

    private void dfs (int curr, int n, List<Integer> res) {
        if (curr > n) return;
        res.add(curr);
        for (int i = 0; i < 10; i++) {
            if (10*curr + i > n) return;
            dfs(10*curr + i, n, res);
        }
    }

    public static void main(String[] args) {
        int n = 13;
        System.out.println(Arrays.toString(new LexicographicalNumbers().lexicalOrder(n).toArray()));
    }
}