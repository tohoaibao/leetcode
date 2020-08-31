import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class OccurrencesAfterBigram {

    // https://leetcode.com/problems/occurrences-after-bigram/
    public String[] findOcurrences(String text, String first, String second) {
        String[] token = text.split(" ");
        List<String> ans = new ArrayList<>();
        for (int i = 2; i < token.length; ++i) {
            if (token[i-2].equals(first) && token[i-1].equals(second)) {
                ans.add(token[i]);
            }
        }
        return ans.toArray(new String[0]);
    }

    public static void main(String[] args) {
//        String text = "alice is a good girl she is a good student", first = "a", second = "good";
        String text = "we will we will rock you", first = "we", second = "will";
        System.out.println(Arrays.toString(new OccurrencesAfterBigram().findOcurrences(text, first, second)));
    }

}