import java.util.regex.Pattern;

class ValidateIPAddress2 {

    // https://leetcode.com/problems/validate-ip-address/
    public String validIPAddress(String IP) {
        String chunkIPv4 = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
        Pattern pattenIPv4 =
                Pattern.compile("^(" + chunkIPv4 + "\\.){3}" + chunkIPv4 + "$");

        String chunkIPv6 = "([0-9a-fA-F]{1,4})";
        Pattern pattenIPv6 =
                Pattern.compile("^(" + chunkIPv6 + "\\:){7}" + chunkIPv6 + "$");
        if (pattenIPv4.matcher(IP).matches()) return "IPv4";
        return (pattenIPv6.matcher(IP).matches()) ? "IPv6" : "Neither";
    }


    public static void main(String[] args) {
        String IP = "172.16.254.1"; // IPv4
//        IP = "172.16.254.01";//Invalid
//        IP = "170.255.255.255";
//        IP = "0201:0db8:85a3:0000:0000:8a2e:0370:7334";
//        IP = "0:0:0:0:0:0:0:0";
//        IP = "2001:0db8:85a3:0:0:8A2E:0370:7334";
//        IP = "12..33.4";
//        IP = "t001:db8:85a3:0:0:8A2E:0370:7334";
//        IP = "1.0.1.";
        System.out.println(new ValidateIPAddress2().validIPAddress(IP));
    }
}