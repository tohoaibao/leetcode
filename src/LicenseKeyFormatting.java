
class LicenseKeyFormatting {

    public String licenseKeyFormatting(String S, int K) {
        StringBuilder sb = new StringBuilder();
        int n = S.length();
        for (int i = n - 1; i >= 0; i--) {
            char c = S.charAt(i);
            if (c != '-') {
                sb.append(sb.length() % (K + 1) == K ? '-' : "").append(S.charAt(i));
            }
        }
        return sb.reverse().toString().toUpperCase();
    }

    public static void main(String[] args) {
        String S = "2-5g-3-J";
        int K = 2;
        System.out.println(new LicenseKeyFormatting().licenseKeyFormatting(S, K));
    }
}