import java.util.Arrays;

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
class SplitLinkedListInParts {

    // https://leetcode.com/problems/split-linked-list-in-parts/
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] res = new ListNode[k];
        ListNode curr = root;

        int n = 0;
        while (curr != null) {
            n++;
            curr = curr.next;
        }
        int size = n / k;
        int r = n % k;

        curr = root;
        for (int i = 0; i < k; i++) {
            ListNode head = new ListNode(0), p = head;
            for (int j = 0; j < size + (i < r ? 1 : 0); j++) {
                p.next = new ListNode(curr.val);
                p = p.next;
                curr = curr.next;
            }
            res[i] = head.next;
        }

        return res;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(7);
        ListNode n8 = new ListNode(8);
        ListNode n9 = new ListNode(9);
        ListNode n10 = new ListNode(10);

        n1.next = n2;
        n2.next = n3;
//        n3.next = n4;
//        n4.next = n5;
//        n5.next = n6;
//        n6.next = n7;
//        n7.next = n8;
//        n8.next = n9;
//        n9.next = n10;

        int k = 5;
        System.out.println(Arrays.toString(new SplitLinkedListInParts().splitListToParts(n1, k)));
    }
}