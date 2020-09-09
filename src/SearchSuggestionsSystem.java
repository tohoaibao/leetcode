
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SearchSuggestionsSystem {

    // https://leetcode.com/problems/search-suggestions-system/
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> ans = new ArrayList<>();
        Arrays.sort(products);
        StringBuilder sb = new StringBuilder();
        for (char c : searchWord.toCharArray()) {
            sb.append(c);
            ans.add(findThreeMatch(products, sb.toString()));
        }
        return ans;
    }

    public List<String> findThreeMatch(String[] products, String key) {
        List<String> lists = new ArrayList<>();
        for (String s : products) {
            if (s.startsWith(key)) {
                lists.add(s);
            }
            if (lists.size()==3) return lists;
        }
        return lists;
    }

    public static void main(String[] args) {
        String[] products = {"mobile","mouse","moneypot","monitor","mousepad"};
        String s = "mouse";
//        String[] products = {"havana"};
//        String s = "havana";
//        String[] products = {"bags","baggage","banner","box","cloths"};
//        String s = "bags";
        List<List<String>> ans = new SearchSuggestionsSystem().suggestedProducts(products, s);
        for (List<String> list : ans) {
            System.out.println(Arrays.toString(list.toArray()));
        }
    }
}