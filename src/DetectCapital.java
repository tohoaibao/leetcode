class DetectCapital {

    // https://leetcode.com/problems/detect-capital/
    public boolean detectCapitalUse(String word) {
        int n = word.length(), caps = 0;
        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(word.charAt(i))){
                caps++;
            }
        }
        if (caps == word.length() || caps == 0) return true;
        return caps == 1 && Character.isUpperCase(word.charAt(0));
    }

    public static void main(String[] args) {
        String s = "USA";
        s = "leetcode";
        s = "BaB";
        System.out.println(new DetectCapital().detectCapitalUse(s));
    }
}