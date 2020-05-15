import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }

        result.add("");
        String values[] = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        char input[] = digits.toCharArray();
        for (char c: input) {
            result = expand(result, values[c - '2']);
        }

        return result;
    }

    private List<String> expand(List<String> list, String s) {
        char arr[] = s.toCharArray();
        List<String> next = new ArrayList<>();
        for (String item: list) {
            for (char c: arr){
                next.add(item + c);
            }
        }
        return next;
    }

    public static void main(String[] args) {
        List<String> list = new LetterCombinationsOfAPhoneNumber().letterCombinations("23");
        for (String item : list) {
            System.out.print(item + " ");
        }
    }
}
