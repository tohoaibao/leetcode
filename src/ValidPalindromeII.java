
public class ValidPalindromeII {

    public boolean validPalindrome(String s) {
        int n = s.length();
        int lo = 0;
        int hi = n - 1;
        while (lo < hi) {
            if (s.charAt(lo) != s.charAt(hi)) {
                String sub1 = s.substring(lo, hi);
                String sub2 = s.substring(lo + 1, hi + 1);
                return subCheck(sub1) || subCheck(sub2);
            }
            lo++;
            hi--;
        }
        return true;
    }

    private boolean subCheck(String s){
        int n = s.length();
        int lo = 0;
        int hi = n - 1;
        while (lo < hi) {
            if (s.charAt(lo++) != s.charAt(hi--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new ValidPalindromeII().validPalindrome("abcdf"));
    }
}
