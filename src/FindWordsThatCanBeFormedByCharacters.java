class FindWordsThatCanBeFormedByCharacters {

    public int countCharacters(String[] words, String chars) {
        int count[] = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            count[chars.charAt(i)-'a']++;
        }

        int sum = 0;
        for (int i = 0; i < words.length; i++) {
            sum += isGoodString(count, words[i]) ? words[i].length() : 0;
        }

        return sum;
    }

    private boolean isGoodString(int count[], String S) {
        int A[] = count.clone();
        for (int i = 0; i < S.length(); i++) {
            if (--A[S.charAt(i)-'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"abc","cba","bcad"};
        String chars = "abc";
        System.out.println(new FindWordsThatCanBeFormedByCharacters().countCharacters(words, chars));
    }
}