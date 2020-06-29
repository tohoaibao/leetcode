public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;
        while (p1 != p2) {
            p1 = (p1 != null) ? p1.next : headB;
            p2 = (p2 != null) ? p2.next : headA;
        }
        return p1;
    }

    public static void main(String[] args) {

        ListNode headA = new ListNode(4);
        ListNode headB = new ListNode(5);

        ListNode link = new ListNode(8);
        link.next = new ListNode(4);
        link.next.next = new ListNode(5);

        headA.next = new ListNode(1);
        headA.next.next = link;

        headB.next = new ListNode(0);
        headB.next.next = new ListNode(1);
        headB.next.next.next = link;


        System.out.println(new IntersectionOfTwoLinkedLists().getIntersectionNode(headA, headB));
    }
}
