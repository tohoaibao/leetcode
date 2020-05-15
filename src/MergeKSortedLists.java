import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        List<Integer> allNodes = new ArrayList<>();
        // O(N)
        for (ListNode p : lists) {
            while (p != null) {
                allNodes.add(p.val);
                p = p.next;
            }
        }

        // O(Nlog(N))
        Collections.sort(allNodes);

        // O(N)
        ListNode head = new ListNode();
        ListNode curr = head;
        for (Integer item: allNodes) {
            curr.next = new ListNode(item);
            curr = curr.next;
        }

        return head.next;
    }


    public static void main(String[] args) {
        int A1[] = {1, 4, 5};
        int A2[] = {1, 3, 4};
        int A3[] = {2, 6};
        ListNode list1 = new ListNode(A1[0]);
        ListNode list2 = new ListNode(A2[0]);
        ListNode list3 = new ListNode(A3[0]);

        ListNode curr = list1;
        for (int i = 1; i < A1.length; i++) {
            curr.next = new ListNode(A1[i]);
            curr = curr.next;
        }

        curr = list2;
        for (int i = 1; i < A2.length; i++) {
            curr.next = new ListNode(A2[i]);
            curr = curr.next;
        }

        curr = list3;
        for (int i = 1; i < A3.length; i++) {
            curr.next = new ListNode(A3[i]);
            curr = curr.next;
        }

        ListNode []lists = {list1, list2, list3};
        ListNode result = new MergeKSortedLists().mergeKLists(lists);
        System.out.println();

    }
}
