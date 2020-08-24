import java.util.Arrays;

class ReorderDataInLogFiles {

    // https://leetcode.com/problems/reorder-data-in-log-files/
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (s1, s2) -> {
            int i1 = s1.indexOf(' ');
            int i2 = s2.indexOf(' ');
            boolean isDigit1 = Character.isDigit(s1.charAt(i1 + 1));
            boolean isDigit2 = Character.isDigit(s2.charAt(i2 + 1));
            if (!isDigit1 && !isDigit2) { // both letter-logs
                int comp = s1.substring(i1+1).compareTo(s2.substring(i2+1));
                if (comp == 0) {
                    return s1.substring(0, i1).compareTo(s2.substring(0, i2));
                }
                return comp;
            } else if (isDigit1 && isDigit2) { // both digit-logs
                return 0;
            } else if (isDigit1) { // digit vs letter
                return 1;
            }
            return -1;
        });
        return logs;
    }

    public static void main(String[] args) {
        String[] logs = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        System.out.println(Arrays.toString(new ReorderDataInLogFiles().reorderLogFiles(logs)));
    }
}