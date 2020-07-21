import java.util.Stack;

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
class AddTwoNumbersII {

    // https://leetcode.com/problems/add-two-numbers-ii/
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }

        ListNode head = null;
        int sum = 0, carry = 0;
        while (!s1.isEmpty() || !s2.isEmpty()) {
            sum = carry;
            if (!s1.isEmpty()) sum += s1.pop();
            if (!s2.isEmpty()) sum += s2.pop();
            ListNode tmp = new ListNode(sum % 10);
            tmp.next = head;
            head = tmp;
            carry = sum / 10;
        }

        if (carry > 0) {
            ListNode tmp = new ListNode(carry);
            tmp.next = head;
            head = tmp;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        System.out.println(new AddTwoNumbersII().addTwoNumbers(new ListNode(5), new ListNode(5)));
    }
}