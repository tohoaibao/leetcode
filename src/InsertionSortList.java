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
class InsertionSortList {

    // https://leetcode.com/problems/insertion-sort-list/
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;

        while (head != null) {
            ListNode temp = head.next;

            /* Before insert, the prev is at the last node of the sorted list.
            Only the last node's value is larger than the current inserting node
            should we move the temp back to the head*/
            if (prev.val > head.val)
                prev = dummy;

            while (prev.next != null && prev.next.val < head.val) {
                prev = prev.next;
            }
            head.next = prev.next;
            prev.next = head;

            head = temp;
        }

        return dummy.next;
    }



    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(3);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        System.out.println(new InsertionSortList().insertionSortList(head));
    }
}