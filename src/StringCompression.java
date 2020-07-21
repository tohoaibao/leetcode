class StringCompression {

    // https://leetcode.com/problems/string-compression/
    public int compress(char[] chars) {
        if (chars == null || chars.length == 0) return 0;
        int left = 0, right = 0, index = 0;
        int n = chars.length;
        while (right < n) {
            int count = 0;
            while (right < n && chars[left] == chars[right]) {
                right++;
                count++;
            }
            chars[index++] = chars[left];
            if (count > 1) {
                char[] value = String.valueOf(count).toCharArray();
                for (int i = 0; i < value.length; i++) {
                    chars[index++] = value[i];
                }
            }
            left = right;
        }

        return index;
    }

    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(new StringCompression().compress(chars));
    }
}