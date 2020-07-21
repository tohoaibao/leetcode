class AddStrings {

    // https://leetcode.com/problems/add-strings/
    public String addStrings(String num1, String num2) {
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (p1 >= 0 || p2 >= 0) {
            int x1 = p1 >= 0 ? num1.charAt(p1--) - '0' : 0;
            int x2 = p2 >= 0 ? num2.charAt(p2--) - '0' : 0;
            int value = x1 + x2 + carry;
            carry = value / 10;
            sb.append(value % 10);
        }

        if (carry > 0) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        System.out.println(new AddStrings().addStrings(num1, num2));
    }

}