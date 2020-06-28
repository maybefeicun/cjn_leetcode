package day.problems.easy;

//import day.problems.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @description:
 * @author: CJN
 * @time: 2020/6/26 上午9:16
 * @Description:
 * @Modified By:
 */
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class No02_01 {
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        Set<Integer> set = new HashSet<>();
        ListNode p = head;
        ListNode q = head.next;
        set.add(p.val);
        while (q != null) {
            if (set.contains(q.val)) {
                p.next = q.next;
                q = p.next;
            } else {
                set.add(q.val);
                p = p.next;
                q = q.next;
            }
        }
        return head;
    }
}
