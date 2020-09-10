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

    public List<Integer> sequentialDigits2(int low, int high) {
        int[] allNums = {12,23,34,45,56,67,78,89,
                123,234,345,456,567,678,789,
                1234,2345,3456,4567,5678,6789,
                12345,23456,34567,45678,56789,
                123456,234567,345678,456789,
                1234567,2345678,3456789,
                12345678,23456789,
                123456789};
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < allNums.length; i++) {
            if (allNums[i] < low) continue;
            if (allNums[i] > high) break;
            res.add(allNums[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int low = 10, high = 1000;
        System.out.println(new SequentialDigits().sequentialDigits(low, high));
    }
}