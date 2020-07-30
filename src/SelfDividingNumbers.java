import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SelfDividingNumbers {

    // https://leetcode.com/problems/self-dividing-numbers/
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int num = left; num <= right; num++) {
            // Check self-dividing number
            if (checkSelfDividingNumbers(num)){
                res.add(num);
            }
        }
        return res;
    }

    private boolean checkSelfDividingNumbers(int num) {
        int n = num;
        while (n > 0) {
            int last = n % 10;
            if (last == 0 || num % last != 0) return false;
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int left = 1;
        int right = 15;
        System.out.println(Arrays.toString(new SelfDividingNumbers().selfDividingNumbers(left, right).toArray()));
    }
}