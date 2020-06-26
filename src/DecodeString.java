import java.util.Stack;

class DecodeString {

    // https://leetcode.com/problems/decode-string/

    public String decodeString(String s) {

        Stack<Integer> s1 = new Stack<>();
        Stack<StringBuilder> s2 = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int k = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + ch - '0';
            } else if (ch == '[') {
                s1.push(k);
                s2.push(sb);
                sb = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                StringBuilder tmp = sb;
                sb = s2.pop();
                for (k = s1.pop(); k > 0; --k) {
                    sb.append(tmp);
                }
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        s = "3[a2[c]]"; // accaccacc
//        s = "2[abc]3[cd]ef"; // abcabccdcdcdef
//        s = "11[a]";
        System.out.println(new DecodeString().decodeString(s));
    }
}