class RemoveAllAdjacentDuplicatesInStringII {

    // https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
    public String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int[] count = new int[s.length()];
        for (char c : s.toCharArray()) {
            sb.append(c);
            int last = sb.length() - 1;
            count[last] = 1 + (last > 0 && sb.charAt(last)==sb.charAt(last-1) ? count[last-1] : 0);
            if (count[last]==k) {
                sb.delete(sb.length()-k,sb.length());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "deeedbbcccbdaa";
        int k = 3;
        System.out.println(new RemoveAllAdjacentDuplicatesInStringII().removeDuplicates(s, k));
    }
}