
public class ReverseVowelsOfAString {

    public String reverseVowels(String s) {
        if (s == null) return null;
        int n = s.length();
        if (n == 1) return s;

        int left = 0;
        int right = n - 1;
        char chars[] = new char[n];
        while (right >= left) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if (isVowels(leftChar) && isVowels(rightChar)) {
                chars[left++] = rightChar;
                chars[right--] = leftChar;
            } else {
                if (!isVowels(leftChar)) {
                    chars[left++] = leftChar;
                }
                if (!isVowels(rightChar)){
                    chars[right--] = rightChar;
                }
            }

        }

        return new String(chars);
    }

    private boolean isVowels(char c) {
        return (c=='a' || c=='o' || c=='e' || c=='u' || c=='i' ||
                c=='A' || c=='O' || c=='E' || c=='U' || c=='I');
    }


    public static void main(String[] args) {
        System.out.println(new ReverseVowelsOfAString().reverseVowels("leetcode"));
    }
}
