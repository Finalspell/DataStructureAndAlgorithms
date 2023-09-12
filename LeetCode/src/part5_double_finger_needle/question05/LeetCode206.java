package part5_double_finger_needle.question05;

import part2_linklist.pojo.ListNode;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-09-08-19:48
 */
public class LeetCode206 {
    public ListNode reverse1(ListNode pre, ListNode cur) {

        while (cur != null) {
            ListNode temp = cur;
            cur = cur.next;
            temp.next = pre;
            pre = temp;
        }
        return pre;
    }

    public ListNode reverse(ListNode pre, ListNode cur) {

        if (cur == null) {
            return pre;
        }
        ListNode temp = cur;
        cur = cur.next;
        temp.next = pre;
        return reverse(temp, cur);

    }

        public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode reverseHead = reverse(pre, cur);

        return reverseHead;
    }
}
