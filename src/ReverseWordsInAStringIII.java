class ReverseWordsInAStringIII {

    // https://leetcode.com/problems/reverse-words-in-a-string-iii/
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (String word: words)
            res.append(new StringBuffer(word).reverse().toString() + " ");
        return res.toString().trim();
    }



    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(new ReverseWordsInAStringIII().reverseWords(s));
    }
}