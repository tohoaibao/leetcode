class DecryptStringFromAlphabetToIntegerMapping {

    // https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        int i = chars.length - 1;
        while (i >= 0) {
            if (chars[i]=='#') {
                // read 2 char
                i--;
                int a = chars[i--] - '0';
                int b = chars[i--] - '0';
                int num = a + b*10;
                sb.append((char)(num + 'a' - 1));
            } else {
                sb.append((char)(chars[i] - '0' + 'a' - 1));
                i--;
            }
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "10#11#12";
        s = "1326#";
        s = "25#";
        s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
        System.out.println(new DecryptStringFromAlphabetToIntegerMapping().freqAlphabets(s));
    }
}