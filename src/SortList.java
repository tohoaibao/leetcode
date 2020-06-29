class SortList {

    // https://leetcode.com/problems/sort-list/
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // step 1. cut the list to two halves
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;

        // step 2. sort each half
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        // step 3. merge l1 and l2
        return merge(l1, l2);
    }

    private ListNode merge(ListNode left, ListNode right) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        ListNode temp = new ListNode(0);
        ListNode curr = temp;
        while (left != null && right != null) {
            if (left.val < right.val) {
                curr.next = left;
                left = left.next;
            } else {
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;
        }

        if (left != null) {
            curr.next = left;
        } else {
            curr.next = right;
        }

        return temp.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(3);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;

        System.out.println(new SortList().sortList(head));
    }
}