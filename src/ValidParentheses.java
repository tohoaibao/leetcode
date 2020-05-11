import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    private HashMap<Character, Character> map;

    public ValidParentheses() {
        this.map = new HashMap<>();
        this.map.put(')','(');
        this.map.put(']','[');
        this.map.put('}','{');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                char top = stack.empty() ? '#' : stack.pop();
                if (top != map.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("([])"));
    }
}
