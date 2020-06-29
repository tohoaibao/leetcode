
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        ListNode head = new ListNode();
        ListNode curr = head;
        while (p != null || q != null) {
            if (p != null && q != null) {
                int x = p.val;
                int y = q.val;
                if (x < y) {
                    curr.next = new ListNode(x);
                    curr = curr.next;
                    if (p != null) p = p.next;
                } else {
                    curr.next = new ListNode(y);
                    curr = curr.next;
                    if (q != null) q = q.next;
                }
            }
            else if (p != null) {
                curr.next = new ListNode(p.val);
                curr = curr.next;
                if (p != null) p = p.next;
            }
            else if (q != null) {
                curr.next = new ListNode(q.val);
                curr = curr.next;
                if (q != null) q = q.next;
            }
        }

        return head.next;
    }

    public static void main(String[] args) {
        int A1[] = {1, 2, 4};
        int A2[] = {1, 3, 4};
        ListNode list1 = new ListNode(A1[0]);
        ListNode curr = list1;
        for (int i = 1; i < A1.length; i++) {
            curr.next = new ListNode(A1[i]);
            curr = curr.next;
        }

        ListNode list2 = new ListNode(A2[0]);
        curr = list2;
        for (int i = 1; i < A2.length; i++) {
            curr.next = new ListNode(A2[i]);
            curr = curr.next;
        }

        System.out.println(new MergeTwoSortedLists().mergeTwoLists(list1, list2));
    }
}
