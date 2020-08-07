class LemonadeChange {

    // https://leetcode.com/problems/lemonade-change/
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) return false;
                five--;
                ten++;
            } else if (bill == 20) {
                // remain = 15 = 5*3 = 5 + 20;
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
//        int[] A = {5,5,5,10,20};
//        int[] A = {5,5,10};
//        int[] A = {10,10};
//        int[] A = {5,5,10,10,20};
        int[] A = {5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5};
        System.out.println(new LemonadeChange().lemonadeChange(A));
    }
}