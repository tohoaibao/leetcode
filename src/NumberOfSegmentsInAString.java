class NumberOfSegmentsInAString {

    // https://leetcode.com/problems/number-of-segments-in-a-string/
    public int countSegments(String s) {
        int segmentCount = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i-1) == ' ')) {
                segmentCount++;
            }
        }

        return segmentCount;
    }

    public static void main(String[] args) {
        String s = "Hello,   my name is John";
        System.out.println(new NumberOfSegmentsInAString().countSegments(s));
    }
}