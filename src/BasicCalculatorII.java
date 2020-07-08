import java.util.Stack;

class BasicCalculatorII {

    // https://leetcode.com/problems/basic-calculator-ii/
    public int calculate(String s) {
        if (s == null || s.length() == 0) return 0;

        int n = s.length();
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char c;
        char sign = '+';
        for (int i = 0; i < n; i++) {
            c = s.charAt(i);
            if (Character.isDigit(c)){
                num = num*10 + c - '0';
            }
            if (!Character.isDigit(c) && c != ' ' || i == n - 1) {
                if (sign == '+') {
                    stack.push(num);
                } else if (sign == '-') {
                    stack.push(-num);
                } else if (sign == '*') {
                    stack.push(stack.pop()*num);
                } else if (sign == '/') {
                    stack.push(stack.pop()/num);
                }
                sign = c;
                num = 0;
            }
        }

        int ans = 0;
        for (int i : stack) {
            ans += i;
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "3+2*2";
        System.out.println(new BasicCalculatorII().calculate(s));
    }
}