
class OddEvenLinkedList {

    // https://leetcode.com/problems/odd-even-linked-list/solution/
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode old = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while (even != null && even.next != null) {
            old.next = even.next;
            old = old.next;
            even.next = old.next;
            even = even.next;
        }
        old.next = evenHead;

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.println(new OddEvenLinkedList().oddEvenList(head));
    }
}