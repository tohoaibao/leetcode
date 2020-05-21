import java.util.ArrayList;
import java.util.List;

class Solution {

    public boolean isLongPressedName(String name, String typed) {

        if (name.equals(typed)) {
            return true;
        }

        Group g1 = groupify(name);
        Group g2 = groupify(typed);

        if (!g1.key.equals(g2.key)) {
            return false;
        }

        for (int i = 0; i < g1.count.size(); ++i) {
            if (g1.count.get(i) > g2.count.get(i)) {
                return false;
            }
        }

        return true;
    }

    public Group groupify(String S) {
        StringBuilder key = new StringBuilder();
        List<Integer> count = new ArrayList<>();
        int anchor = 0;
        int N = S.length();
        for (int i = 0; i < N; ++i) {
            if (i == N - 1 || S.charAt(i) != S.charAt(i + 1)) {
                key.append(S.charAt(i));
                count.add(i - anchor + 1);
                anchor = i + 1;
            }
        }

        return new Group(key.toString(), count);
    }

    class Group {
        String key;
        List<Integer> count;
        Group(String key, List<Integer> count) {
           this.key = key;
           this.count = count;
        }
    }

    public static void main(String[] args) {
        String name = "alex", typed = "aaleex";
        System.out.println(new Solution().isLongPressedName(name, typed));
    }
}