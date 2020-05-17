public class SwapNodesInPairs {

    /*
    You may not modify the values in the list's nodes, only nodes itself may be changed.
     */
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = head.next;
        head.next = swapPairs(head.next.next);
        p.next = head;
        return p;
    }

    public static void main(String[] args) {
        int A[] = {1,2,3};
        ListNode head = new ListNode(1);
        ListNode curr = head;
        for (int i = 1; i < A.length; i++) {
            curr.next = new ListNode(A[i]);
            curr = curr.next;
        }
        System.out.println(new SwapNodesInPairs().swapPairs(head));
    }
}
