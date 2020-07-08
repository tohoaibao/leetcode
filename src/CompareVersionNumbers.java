class CompareVersionNumbers {

    // https://leetcode.com/problems/compare-version-numbers/
    public int compareVersion(String version1, String version2) {
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");
        int l1 = s1.length;
        int l2 = s2.length;
        int maxLen = Math.max(l1, l2);
        for (int i =  0; i < maxLen; i++) {
            int num1 = i < l1 ? Integer.parseInt(s1[i]) : 0;
            int num2 = i < l2 ? Integer.parseInt(s2[i]) : 0;
            if (num1 < num2) {
                return -1;
            } else if (num1 > num2) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
//        String version1 = "0.1", version2 = "1.1";
        String version1 = "1.0.1", version2 = "1";
//        String version1 = "7.5.2.4", version2 = "7.5.3";
//        String version1 = "1.01", version2 = "1.001";
//        String version1 = "1.0", version2 = "1.0.0";
        System.out.println(new CompareVersionNumbers().compareVersion(version1, version2));
    }
}