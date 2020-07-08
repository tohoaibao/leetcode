class ReverseWordsInAString {

    // https://leetcode.com/problems/reverse-words-in-a-string/
    public String reverseWords(String s) {
        s = s.trim();
        String[] A = s.split("\\s+");
        int n = A.length;
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            sb.append(A[i]);
            if (i != 0) sb.append(" ");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        s = "  hello world!  ";
        s = "a good   example";
        System.out.println(new ReverseWordsInAString().reverseWords(s));
    }
}