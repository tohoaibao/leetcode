
public class MinimumWindowSubstring {

    // https://leetcode.com/problems/minimum-window-substring/
    public String minWindow(String s, String t) {
        int[] count = new int[128];
        for(char c : t.toCharArray()) {
            count[c]++;
        }
        int start =0;
        int end =0;
        int len = t.length();
        int min = s.length();
        String res = "";
        while(end < s.length()){
            if(count[s.charAt(end)] > 0) len--;
            count[s.charAt(end)]--;
            while(len == 0){
                if(end-start+1 <= min){
                    min = end-start+1;
                    res = s.substring(start,end+1);
                }
                if(count[s.charAt(start)] == 0) len++;
                count[s.charAt(start)]++;
                start++;
            }
            end++;
        }
        return res;
    }



    public static void main(String[] args) {
        String S = "ADOBECODEBANC", T = "ABC"; // Output = BANC
//        String S = "bbaa", T = "aba";
//        String S = "abc", T = "ac";
        System.out.println(new MinimumWindowSubstring().minWindow(S, T));
    }
}
