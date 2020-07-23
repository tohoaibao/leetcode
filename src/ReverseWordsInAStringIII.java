class ReverseWordsInAStringIII {

    // https://leetcode.com/problems/reverse-words-in-a-string-iii/
    public String reverseWords(String s) {
        String[] A = s.split("\\s");
        int n = A.length;
        for (int i = 0; i < n; i++) {
            A[i] = new StringBuilder(A[i]).reverse().toString();
        }
        return String.join(" ", A);
    }



    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(new ReverseWordsInAStringIII().reverseWords(s));
    }
}