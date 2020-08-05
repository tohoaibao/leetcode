class MaskingPersonalInformation {

    // https://leetcode.com/problems/masking-personal-information/
    public String maskPII(String S) {
        int idx = S.indexOf('@');
        if (idx > 0) { // email
            S = S.toLowerCase();
            return S.charAt(0) + "*****" + S.charAt(idx - 1) + S.substring(idx);
        }
        // phone
        S = S.replaceAll("[^0-9]", "");
        String[] country = {"***-***-", "+*-***-***-", "+**-***-***-","+***-***-***-"};
        return country[S.length()-10] + S.substring(S.length() - 4);
    }

    public static void main(String[] args) {
        String s1 = "LeetCode@LeetCode.com";
        String s2 = "AB@qq.com";
        String s3 = "1(234)567-890";
        String s4 = "86-(10)12345678";
        String s5 = "+(501321)-50-23431";
        System.out.println(new MaskingPersonalInformation().maskPII(s3));
        System.out.println(new MaskingPersonalInformation().maskPII(s2));
        System.out.println(new MaskingPersonalInformation().maskPII(s3));
        System.out.println(new MaskingPersonalInformation().maskPII(s4));
        System.out.println(new MaskingPersonalInformation().maskPII(s5));
    }
}