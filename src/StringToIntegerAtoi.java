public class StringToIntegerAtoi {

    public static int myAtoi(String str) {
        if(str == null || str.isEmpty() || str.trim().length() == 0){
            return 0;
        }
        str = str.trim();
        int sign = 1;
        int i = 0;
        char firstChar = str.charAt(0);

        if(firstChar == '-'){
            sign = -1;
            i = 1;
        }
        if(firstChar == '+'){
            i = 1;
        }
        int result = 0;
        while (i < str.length() && Character.isDigit(str.charAt(i))){
            int intValue = Character.getNumericValue(str.charAt(i));
            if(result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && intValue > 7))
                return Integer.MAX_VALUE;
            if(result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && intValue > 8))
                return Integer.MIN_VALUE;
            result = result * 10 + intValue * sign;
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("+1232"));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
