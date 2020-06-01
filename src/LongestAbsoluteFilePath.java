import java.util.Stack;

class LongestAbsoluteFilePath {

    public int lengthLongestPath(String input) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int result = 0;
        for (String s: input.split("\n")) {
            int level = s.lastIndexOf("\t") + 1;
            while (level < stack.size() - 1) {
                stack.pop();
            }
            int len = stack.peek() + s.length() - level + 1;
            stack.push(len);
            if (s.contains(".")) {
                result = Math.max(result, len - 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
        System.out.println(new LongestAbsoluteFilePath().lengthLongestPath(input));
    }
}