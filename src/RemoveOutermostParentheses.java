
public class RemoveOutermostParentheses {

    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int bracketCount = 0, start = 0;

        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == '(') bracketCount++;
            if(S.charAt(i) == ')') bracketCount--;
            if(bracketCount == 0 && i > 0){
                sb.append(S.substring(start + 1, i));
                start = i + 1;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new RemoveOutermostParentheses().removeOuterParentheses("(()())(())"));
    }
}
