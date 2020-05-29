import java.util.*;

class MinimumIndexSumOfTwoLists {

    public String[] findRestaurant(String[] list1, String[] list2) {
        int n1 = list1.length;
        int n2 = list2.length;
        Map<String, Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        int min_sum = Integer.MAX_VALUE;

        for (int i = 0; i < n1; i++) {
            map.put(list1[i], i);
        }

        for (int i = 0; i < n2; i++) {
            Integer j = map.get(list2[i]);
            if (j != null && i + j <= min_sum) {
                if(i + j < min_sum){
                    res.clear();
                    min_sum = i + j;
                }
                res.add(list2[i]);
            }
        }

        return res.toArray(new String[res.size()]);
    }

    public static void main(String[] args) {
        String [] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String [] list2 = {"KFC","Shogun","Burger King"};
        String ans[] = new MinimumIndexSumOfTwoLists().findRestaurant(list1, list2);
        System.out.println(Arrays.toString(ans));
    }
}