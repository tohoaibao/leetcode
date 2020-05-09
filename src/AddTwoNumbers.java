public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode curr = head;
        ListNode p = l1;
        ListNode q = l2;
        int carry = 0;

        while (p != null || q!= null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return head.next;
    }

    public static void main(String[] args) throws Exception {
        ListNode n3 = new ListNode(3);
        ListNode n2 = new ListNode(4, n3);
        ListNode list1 = new ListNode(2, n2);

        ListNode a3 = new ListNode(4);
        ListNode a2 = new ListNode(6, a3);
        ListNode list2 = new ListNode(5, a2);

        System.out.println(addTwoNumbers(list1, list2));

    }
}

