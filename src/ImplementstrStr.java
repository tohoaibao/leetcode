
public class ImplementstrStr {

    public int strStr(String haystack, String needle) {

        if (needle.length() == 0) {
            return 0;
        }

        char source[] = haystack.toCharArray();
        char target[] = needle.toCharArray();
        int sourceCount = source.length;
        int targetCount = target.length;

        char first = target[0];
        int max = sourceCount - targetCount;

        for (int i = 0; i <= max; i++) {
            // Find first character
            if (source[i] != first) {
                while (++i <= max && source[i] != first);
            }
            if (i <= max) {
                int j = i + 1;
                int end = j + needle.length() - 1;
                for (int k = 1; j < end && source[j] == target[k];
                     j++, k++);
                if (j == end) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String haystack = "hello", needle = "llo";
        System.out.println(new ImplementstrStr().strStr(haystack, needle));
    }
}
