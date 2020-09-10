import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SequentialDigits {

    // https://leetcode.com/problems/sequential-digits/
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i < 9; i++) {
            buildNumbers(i, low, high, ans);
        }
        Collections.sort(ans);
        return ans;
    }

    private void buildNumbers(int num, int low, int high, List<Integer> ans) {
        if (num >= low && num <= high) {
            ans.add(num);
        }
        if (num > high) return;

        int lastDigit = num % 10;
        if (lastDigit < 9) {
            num = num * 10 + lastDigit + 1;
            buildNumbers(num, low, high, ans);
        }
    }

    public static void main(String[] args) {
        int low = 10, high = 1000;
        System.out.println(new SequentialDigits().sequentialDigits(low, high));
    }
}