import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class RestoreIPAddresses {

    // https://leetcode.com/problems/restore-ip-addresses/
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        int len = s.length();
        for (int i = 1; i < 4 && i < len - 2; i++) {
            for (int j = i + 1; j < i + 4 && j < len - 1; j++) {
                for (int k = j + 1; k < j + 4 && k < len; k++) {
                    String s1 = s.substring(0, i);
                    String s2 = s.substring(i, j);
                    String s3 = s.substring(j, k);
                    String s4 = s.substring(k, len);
                    if (isValid(s1) && isValid(s2) && isValid(s3) && isValid(s4)) {
                        ans.add(s1 + "." + s2 + "." + s3 + "." + s4);
                    }
                }
            }
        }

        return ans;
    }

    private boolean isValid(String s) {
        if (s.length() > 3) return false;
        if (s.charAt(0)=='0' && s.length() > 1) return false;
        int num = Integer.parseInt(s);
        return num >= 0 && num <= 255;
    }

    public static void main(String[] args) {
        String s = "25525511135";
        s = "0000";
        s = "010010";
        s = "0279245587303";
        System.out.println(Arrays.toString(new RestoreIPAddresses().restoreIpAddresses(s).toArray()));
    }
}