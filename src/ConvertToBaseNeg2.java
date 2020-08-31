class ConvertToBaseNeg2 {

    // https://leetcode.com/problems/convert-to-base-2/
    public String baseNeg2(int N) {
        StringBuilder sb = new StringBuilder();
        while (N != 0) {
            sb.append(N&1);
            N = -(N >> 1);
        }
        return sb.length() > 0 ? sb.reverse().toString() : "0";
    }

    public static void main(String[] args) {
        int N = 4;
        System.out.println(new ConvertToBaseNeg2().baseNeg2(N));
    }
}