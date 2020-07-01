
public class ValidPalindrome {

    // https://leetcode.com/problems/valid-palindrome/
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left <= right && !Character.isLetterOrDigit(s.charAt(left)))
                left++;
            while (left <= right && !Character.isLetterOrDigit(s.charAt(right)))
                right--;
            if (left < right &&
                    Character.toLowerCase(s.charAt(left++)) != Character.toLowerCase(s.charAt(right--)))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
//        s = "race a car";
        System.out.println(new ValidPalindrome().isPalindrome(s));
    }
}
