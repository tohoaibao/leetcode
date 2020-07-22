class ValidateIPAddress {

    // https://leetcode.com/problems/validate-ip-address/
    public String validIPAddress(String IP) {
        if (IP.chars().filter(ch -> ch == '.').count() == 3) {
            // Validate as IPv4
            return validateIPv4(IP);
        }
        if (IP.chars().filter(ch -> ch == ':').count() == 7) {
            // Validate as IPv6
            return validateIPv6(IP);
        }

        return "Neither";
    }

    private String validateIPv6(String IP) {
        String[] nums = IP.split(":");
        String hexdigits = "0123456789abcdefABCDEF";
        for (String num : nums) {
            // at least one and not more than 4 hexdigits in one chunk
            if (num.length() == 0 || num.length() > 4) return "Neither";
            // only hexdigits are allowed: 0-9, a-f, A-F
            for (Character ch : num.toCharArray()) {
                if (hexdigits.indexOf(ch) == -1) return "Neither";
            }
        }
        return "IPv6";
    }

    private String validateIPv4(String IP) {
        String[] nums = IP.split("\\.", -1);
        for (String num : nums) {
            // length of chunk is between 1 and 3
            if (num.length() == 0 || num.length() > 3) return "Neither";
            // no extra leading zeros
            if (num.charAt(0) == '0' && num.length() > 1) return "Neither";
            // only digits are allowed
            for (char ch : num.toCharArray()) {
                if (!Character.isDigit(ch)) return "Neither";
            }
            // less than 255
            if (Integer.parseInt(num) > 255) return "Neither";
        }
        return "IPv4";
    }

    public static void main(String[] args) {
        String IP = "172.16.254.1"; // IPv4
//        IP = "172.16.254.01";//Invalid
//        IP = "170.255.255.255";
        IP = "0201:0db8:85a3:0000:0000:8a2e:0370:7334";
//        IP = "0:0:0:0:0:0:0:0";
//        IP = "2001:0db8:85a3:0:0:8A2E:0370:7334";
//        IP = "12..33.4";
//        IP = "t001:db8:85a3:0:0:8A2E:0370:7334";
        IP = "1.0.1.";
        System.out.println(new ValidateIPAddress().validIPAddress(IP));
    }
}