import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FizzBuzz {

    // https://leetcode.com/problems/fizz-buzz/
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                ans.add("FizzBuzz");
            } else if (i % 3 == 0) {
                ans.add("Fizz");
            } else if (i % 5 == 0) {
                ans.add("Buzz");
            } else {
                ans.add(String.valueOf(i));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(Arrays.toString(new FizzBuzz().fizzBuzz(n).toArray()));
    }
}