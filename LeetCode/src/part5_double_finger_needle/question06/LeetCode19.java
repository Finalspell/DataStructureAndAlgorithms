package part5_double_finger_needle.question06;

import part2_linklist.pojo.ListNode;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-09-08-20:05
 */
public class LeetCode19 {
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;

        ListNode fast = dummyHead;
        ListNode slow = dummyHead;

        n++;
        while (n-- > 0) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return dummyHead.next;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;

        ListNode slow = dummyHead;
        ListNode fast = dummyHead;

        n++;
        while (n-- > 0) {
            fast = fast.next;
        }

        while (fast != null) {
            fast= fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummyHead.next;
    }
}
