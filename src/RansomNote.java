public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        char A[] = ransomNote.toCharArray();
        char B[] = magazine.toCharArray();

        int counter[] = new int[26];
        for (int i = 0; i < B.length; i++) {
            counter[B[i] - 97]++;
        }

        for (int i = 0; i < A.length; i++) {
            int c = A[i] - 97;
            if (counter[c] == 0) {
                return false;
            } else {
                counter[c]--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "ab";
        System.out.println(new RansomNote().canConstruct(ransomNote, magazine));
    }
}
