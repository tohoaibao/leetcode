import java.util.Stack;

class ScoreOfParentheses {

    // https://leetcode.com/problems/score-of-parentheses/
    public int scoreOfParentheses(String S) {
        Stack<Integer> stack = new Stack<>();
        int curr = 0;
        for (char c : S.toCharArray()) {
            if (c == '(') {
                stack.push(curr);
                curr = 0;
            } else {
                curr = stack.pop() + Math.max(2*curr, 1);
            }
        }
        return curr;
    }

    public static void main(String[] args) {
        String s = "(()(()))";// 6
//        s = "()()()";
        System.out.println(new ScoreOfParentheses().scoreOfParentheses(s));
    }
}