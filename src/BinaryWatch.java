import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BinaryWatch {

    // https://leetcode.com/problems/binary-watch/
    public List<String> readBinaryWatch(int num) {
        List<String> times = new ArrayList<>();
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                int time = (h << 6) + m;
                if (Integer.bitCount(time) == num) {
                  times.add(String.format("%d:%02d", h, m));
                }
            }
        }
        return times;
    }


    public static void main(String[] args) {
        int num = 2;
        System.out.println(Arrays.toString(new BinaryWatch().readBinaryWatch(num).toArray()));
    }
}