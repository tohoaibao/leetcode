public class RomanToInteger {

    public static int romanToInt(String s) {
        int sum = 0;
        int buffer = 0;
        int tmp = 0;
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    tmp = 1;
                    break;
                case 'V':
                    tmp = 5;
                    break;
                case 'X':
                    tmp = 10;
                    break;
                case 'L':
                    tmp = 50;
                    break;
                case 'C':
                    tmp = 100;
                    break;
                case 'D':
                    tmp = 500;
                    break;
                case 'M':
                    tmp = 1000;
                    break;
            }
            if (buffer <= tmp) {
                sum += tmp;
            } else {
                sum -= tmp;
            }
            buffer = tmp;
        }

        return sum;
    }



    public static void main(String[] args){
        System.out.println(romanToInt("IV"));
    }
}

