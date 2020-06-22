
public class CountAndSay {

    public String countAndSay(int n) {
        StringBuilder curr = new StringBuilder("1");
        StringBuilder prev;
        int count;
        char c;
        for (int i = 1; i < n; i++) {
            prev = curr;
            curr = new StringBuilder();
            count = 1;
            c = prev.charAt(0);
            for (int j = 1, len = prev.length(); j < len; j++) {
                if (prev.charAt(j) == c) {
                    count++;
                } else {
                    curr.append(count).append(c);
                    count = 1;
                    c = prev.charAt(j);
                }
            }
            curr.append(count).append(c);
        }

        return curr.toString();
    }

    public static void main(String[] args) {
        System.out.println(new CountAndSay().countAndSay(5));
    }
}
