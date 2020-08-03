import java.util.*;

class SubdomainVisitCount {

    // https://leetcode.com/problems/subdomain-visit-count/
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> ans = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String s : cpdomains) {
            String[] A = s.split("\\s");
            int number = Integer.parseInt(A[0]);
            String address = A[1];
            map.put(address, map.getOrDefault(address, 0) + number);
            int n = address.length();
            for (int i = 0; i < n; i++) {
                if (address.charAt(i) == '.') {
                    String sub = address.substring(i + 1);
                    map.put(sub, map.getOrDefault(sub, 0) + number);
                }
            }
        }

        for (String k : map.keySet()) {
            ans.add(map.get(k) + " " + k);
        }

        return ans;
    }

    public static void main(String[] args) {
        String[] A = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        System.out.println(Arrays.toString(new SubdomainVisitCount().subdomainVisits(A).toArray()));
    }
}