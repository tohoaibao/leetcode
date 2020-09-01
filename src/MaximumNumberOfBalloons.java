class MaximumNumberOfBalloons {

    // https://leetcode.com/problems/maximum-number-of-balloons/
    public int maxNumberOfBalloons(String text) {
        int[] count1 = new int[26];
        for (char c : text.toCharArray()) {
            count1[c-'a']++;
        }

        int[] count2 = new int[26];
        char[] chars = "balloon".toCharArray();
        for (char c : chars) {
            count2[c-'a']++;
        }
        int ans = Integer.MAX_VALUE;
        for (char c : chars) {
            ans = Math.min(ans, count1[c-'a']/count2[c-'a']);
        }

        return ans;
    }

    public static void main(String[] args) {
        String text = "loonbalxballpoon";
        text = "nlaebolko";
        text = "leetcode";
        System.out.println(new MaximumNumberOfBalloons().maxNumberOfBalloons(text));
    }
}