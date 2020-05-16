
public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {
        int A[] = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            A[s.charAt(i) - 97]++;
        }

        for (int i = 0; i < n; i++) {
            if (A[s.charAt(i) - 97] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new FirstUniqueCharacterInAString().firstUniqChar("loveleetcode"));
    }
}
