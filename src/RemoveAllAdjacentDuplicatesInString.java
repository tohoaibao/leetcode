

class RemoveAllAdjacentDuplicatesInString {

    // https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
    public String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray()) {
            int size = sb.length();
            if (size > 0 && sb.charAt(size-1)==c) {
                sb.deleteCharAt(size - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String S = "abbaca";
//        S = "azxxzy";
        System.out.println(new RemoveAllAdjacentDuplicatesInString().removeDuplicates(S));
    }
}