public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Get size linked list
        ListNode p = head;
        int size = 0;
        while (p != null) {
            size++;
            p = p.next;
        }
        // Find index
        int index = size - n;

        if (index == 0) {
            head = head.next;
            return head;
        }

        p = head;
        ListNode prev = null;
        while (index-- > 0) {
            prev = p;
            p = p.next;
        }
        prev.next = p.next;

        return head;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        ListNode list = new ListNode(arr[0]);
        ListNode curr = list;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }

        System.out.println(new RemoveNthNodeFromEndOfList().removeNthFromEnd(list, 5));
    }
}
