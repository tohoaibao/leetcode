class GoatLatin {

    // https://leetcode.com/problems/goat-latin/
    public String toGoatLatin(String S) {
        StringBuilder sb = new StringBuilder();
        String[] tokens = S.split("\\s");
        int count = 1;
        for (String t : tokens) {
            if (isVowel(t.charAt(0))) {
                sb.append(t).append("ma");
            } else {
                sb.append(t.substring(1)).append(t.charAt(0)).append("ma");
            }
            for (int i = 0; i < count; i++) {
                sb.append("a");
            }
            sb.append(" ");
            count++;
        }

        return sb.toString().trim();
    }

    private boolean isVowel(char c) {
        return (c == 'a' || c == 'o' || c == 'e' || c == 'u' || c == 'i' ||
                c == 'A' || c == 'O' || c == 'E' || c == 'U' || c == 'I');
    }

    public static void main(String[] args) {
        String s = "I speak Goat Latin"; // Imaa peaksmaaa oatGmaaaa atinLmaaaaa
        System.out.println(new GoatLatin().toGoatLatin(s).equals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa"));
    }
}