import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        if (n == 0){
            ans.add("");
        } else {
            for (int i = 0; i < n; i++){
                for (String left: generateParenthesis(i)){
                    for (String right: generateParenthesis(n - i -1)){
                        ans.add("(" + left + ")" + right);
                    }
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        List<String> result = new GenerateParentheses().generateParenthesis(3);
        for (String item: result) {
            System.out.println(item);
        }
    }
}
