class ToLowerCase {

    // https://leetcode.com/problems/to-lower-case/
    public String toLowerCase(String str) {
        char[] s = str.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= 'A' && s[i] <= 'Z') {
                s[i] += 32;
            }
        }
        return String.valueOf(s);
    }

    public static void main(String[] args) {
        String s = "LOVELY";
        s = "Hello";
        System.out.println(new ToLowerCase().toLowerCase(s));
    }
}