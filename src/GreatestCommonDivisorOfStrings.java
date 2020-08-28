class GreatestCommonDivisorOfStrings {

    // https://leetcode.com/problems/greatest-common-divisor-of-strings/
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1+str2).equals(str2+str1))
            return "";
        int n1 = str1.length(), n2 = str2.length();
        int gcd = gcd(n1, n2);
        if (n1 < n2) {
            return str1.substring(0, gcd);
        }

        return str2.substring(0, gcd);
    }

    public int gcd(int a, int b) {
        return a==0 ? b : gcd(b%a, a);
    }

    public static void main(String[] args) {
//        String str1 = "ABCABC", str2 = "ABC";
        String str1 = "ABABAB", str2 = "ABAB";
//        String str1 = "ABCDEF", str2 = "ABC";
//        String str1="AAAAAAAAA", str2="AAACCC";
        System.out.println(new GreatestCommonDivisorOfStrings().gcdOfStrings(str1, str2));
    }
}