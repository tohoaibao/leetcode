class NimGame {

    public boolean canWinNim(int n) {
        return (n % 4 != 0);
    }

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(new NimGame().canWinNim(i) + "-" + i);
        }
    }
}