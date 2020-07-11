package day.problems.easy;

public class No206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode first = new ListNode(-1);
        ListNode p = head;
        ListNode q = null;
        while (p != null) {
            q = p.next;
            p.next = first.next;
            first.next = p;
            p = q;
        }
        return first.next;
    }
}
