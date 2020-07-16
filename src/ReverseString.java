import java.util.Arrays;

class ReverseString {

    // https://leetcode.com/problems/reverse-string/
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        new ReverseString().reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}