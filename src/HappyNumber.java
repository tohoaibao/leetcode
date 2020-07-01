
public class HappyNumber {

    // https://leetcode.com/problems/happy-number/
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        do {
            slow = sumOfSquares(slow);
            fast= sumOfSquares(fast);
            fast = sumOfSquares(fast);
        } while (slow != fast);
        return slow == 1;
    }

    private int sumOfSquares (int n) {
        int sum = 0, num;
        while (n > 0) {
            num = n%10;
            n = n/10;
            sum += num*num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(new HappyNumber().isHappy(n));
    }
}
