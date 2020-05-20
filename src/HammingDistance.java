class HammingDistance {

    public int hammingDistance(int x, int y) {
        int count = 0;
        int xor = x ^ y;
        String bitXor = Integer.toBinaryString(xor);
        for (int i = 0; i < bitXor.length(); i++) {
            if (bitXor.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new HammingDistance().hammingDistance(3, 1));
    }
}