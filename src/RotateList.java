public class RotateList {

    // https://leetcode.com/problems/rotate-list/
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int n = 1;
        ListNode tail = head;
        while (tail.next != null) {
            n++;
            tail = tail.next;
        }

        k = k % n;
        int steps = n - k;
        ListNode tailCopy = tail;
        tailCopy.next = head; //create cycle

        while (steps -- > 0) {
            tailCopy = tailCopy.next;
        }

        head = tailCopy.next;
        tailCopy.next = null;

        return head;
    }


    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int k = 2;
        ListNode head = new ListNode(A[0]);
        ListNode curr = head;
        for (int i = 1; i < A.length; i++) {
            curr.next = new ListNode(A[i]);
            curr = curr.next;
        }

        ListNode res = new RotateList().rotateRight(head, k);
        System.out.println(res);
    }
}
