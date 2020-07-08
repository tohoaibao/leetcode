import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class KeysAndRooms {
    //https://leetcode.com/problems/keys-and-rooms/
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] seen = new boolean[rooms.size()];
        seen[0] = true;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        // At the beginning, we have a todo list "stack" of keys to use.
        while (!stack.isEmpty()) {
            int node = stack.pop();
            for (int nei : rooms.get(node)) {
                if (!seen[nei]) {
                    seen[nei] = true;
                    stack.push(nei);
                }
            }
        }

        // if any room hasn't been visited, return false
        for (boolean v : seen) {
            if (!v) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1,3));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(3,0,1));
        List<Integer> l3 = new ArrayList<>(Arrays.asList(2));
        List<Integer> l4 = new ArrayList<>(Arrays.asList(0));
        List<List<Integer>> rooms = new ArrayList<>(Arrays.asList(l1,l2,l3,l4));

        System.out.println(new KeysAndRooms().canVisitAllRooms(rooms));
    }
}