class DetectCapital {

    // https://leetcode.com/problems/detect-capital/
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        // All letters in this word are not capitals
        if (Character.isLowerCase(word.charAt(0))) {
            for (int i = 1; i < n; i++) {
                if (!Character.isLowerCase(word.charAt(i))) return false;
            }
            return true;
        }
        // All letters in this word are capitals
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (!Character.isLowerCase(word.charAt(i))) {
                count++;
            }
        }
        return count == n || count == 1;
    }

    public static void main(String[] args) {
        String s = "USA";
        s = "leetcode";
        s = "BaB";
        System.out.println(new DetectCapital().detectCapitalUse(s));
    }
}