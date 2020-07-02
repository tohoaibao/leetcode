import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {

    // https://leetcode.com/problems/find-all-anagrams-in-a-string/
    public List<Integer> findAnagrams(String s, String p) {
        int[] count = new int[128];
        for(char c : p.toCharArray()) {
            count[c]++;
        }
        int start =0;
        int end =0;
        int len = p.length();
        List<Integer> ans = new ArrayList<>();
        while(end < s.length()){
            if(count[s.charAt(end)] > 0) len--;
            count[s.charAt(end)]--;
            while(len == 0){
                if(end-start+1 == p.length()){
                    ans.add(start);
                }
                if(count[s.charAt(start)] == 0) len++;
                count[s.charAt(start)]++;
                start++;
            }
            end++;
        }
        return ans;
    }



    public static void main(String[] args) {
        String s = "abab", p = "ab";
        System.out.println(Arrays.toString(new FindAllAnagramsInAString().findAnagrams(s, p).toArray()));
    }
}
