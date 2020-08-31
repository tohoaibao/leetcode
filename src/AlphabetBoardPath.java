
import java.util.HashMap;
import java.util.Map;

class AlphabetBoardPath {

    // https://leetcode.com/problems/alphabet-board-path/
    public String alphabetBoardPath(String target) {
        String[] board = {"abcde", "fghij", "klmno", "pqrst", "uvwxy", "z"};
        Map<Character, int[]> map = new HashMap<>();
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[i].length(); ++j) {
                map.put(board[i].charAt(j), new int[]{i, j});
            }
        }
        int x = 0, y = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : target.toCharArray()) {
            int[] p = map.get(c);
            int x1 = p[0];
            int y1 = p[1];
            while (x1 < x) {x--; sb.append('U');}
            while (y1 > y) {y++; sb.append('R');}
            while (y1 < y) {y--; sb.append('L');}
            while (x1 > x) {x++; sb.append('D');}
            sb.append('!');
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String target = "leet";
//        target = "code";
//        target = "zdz";
        System.out.println(new AlphabetBoardPath().alphabetBoardPath(target));
    }
}