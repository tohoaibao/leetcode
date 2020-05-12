public class IntegerToRoman {

    public String intToRoman(int num) {
        int values[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String romans[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
           while (num >= values[i]) {
               sb.append(romans[i]);
               num -= values[i];
           }
           i++;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new IntegerToRoman().intToRoman(58));
    }
}
