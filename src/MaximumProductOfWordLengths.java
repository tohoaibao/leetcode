class MaximumProductOfWordLengths {

    // https://leetcode.com/problems/maximum-product-of-word-lengths/
    public int maxProduct(String[] words) {
        int maxProduct = 0;
        if (words == null || words.length == 0) {
            return maxProduct;
        }
        int n = words.length;
        int[] wordsInt = new int[n];
        for (int i = 0; i < n; i++) {
            String tmp = words[i];
            wordsInt[i] = 0;
            for (Character c : tmp.toCharArray()) {
                wordsInt[i] |= 1 << (c - 'a');
            }
//            System.out.println(tmp  + "-" + wordsInt[i] + "-" + Integer.toBinaryString(wordsInt[i]));
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((wordsInt[i] & wordsInt[j]) == 0) {
                    maxProduct = Math.max(maxProduct, words[i].length()*words[j].length());
                }
            }
        }

        return maxProduct;
    }



    public static void main(String[] args) {
//        String[] A = {"a","ab","abc","d","cd","bcd","abcd"}; // 4
        String[] A = {"abcw","baz","foo","bar","xtfn","abcdef"}; // 16
//        String[] A = {"a","aa","aaa","aaaa"}; // 0

        System.out.println(new MaximumProductOfWordLengths().maxProduct(A));
    }
}