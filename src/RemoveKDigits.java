import java.util.Stack;

class RemoveKDigits {

    // https://leetcode.com/problems/remove-k-digits/
    public String removeKdigits(String num, int k) {
        int n = num.length();
        if (n == k) return "0";
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < n) {
            while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
            i++;
        }

        // corner case like "1111"
        while (k > 0) {
            stack.pop();
            k--;
        }

        // construct the number from the stack
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
            sb.append(stack.pop());
        sb.reverse();

        // remove all the 0 at the head
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String num = "1432219";
//        num = "10200";
//        num = "10";
        int k = 3;
        System.out.println(new RemoveKDigits().removeKdigits(num, k));
    }
}