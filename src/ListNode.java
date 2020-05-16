public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val;}
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        ListNode p = this;
        while (p != null) {
            builder.append(p.val + " ");
            p = p.next;
        }
        return builder.toString();
    }
}
