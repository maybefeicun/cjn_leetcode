package list.easy;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class No21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head = new ListNode(-1);
        ListNode _head = head;
        while (l1 != null && l2 != null) {
            ListNode temp = null;
            if (l1.val < l2.val) {
                temp = l1.next;
                _head.next = l1;
                l1 = temp;

            } else {
                temp = l2.next;
                _head.next = l2;
                l2 = temp;
            }
            _head = _head.next;
        }
        if (l1 == null) {
            _head.next = l2;
        } else {
            _head.next = l1;
        }
        return head.next;
    }
}
