package part5_double_finger_needle.question08;

import part2_linklist.pojo.ListNode;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-09-09-19:02
 */
public class LeetCode142 {
    public ListNode detectCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                ListNode crossNode = fast;

                while (head != crossNode) {
                    head = head.next;
                    crossNode = crossNode.next;
                }
                return crossNode;
            }
        }

        return null;
    }
}
