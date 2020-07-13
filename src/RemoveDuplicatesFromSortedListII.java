/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class RemoveDuplicatesFromSortedListII {

    // https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode curr = head;
        ListNode prev = fakeHead;
        while (curr != null) {
            while (curr.next != null && curr.val == curr.next.val) {
                curr = curr.next;
            }
            if (prev.next == curr) {
                prev = prev.next;
            } else {
                prev.next = curr.next;
            }

            curr = curr.next;
        }

        return fakeHead.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(2);
        ListNode n5 = new ListNode(3);
//        ListNode n6 = new ListNode(4);
//        ListNode n7 = new ListNode(5);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
//        n5.next = n6;
//        n6.next = n7;

        System.out.println(new RemoveDuplicatesFromSortedListII().deleteDuplicates(head));
    }
}