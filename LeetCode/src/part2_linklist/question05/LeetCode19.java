package part2_linklist.question05;

import part2_linklist.pojo.ListNode;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-08-27-19:24
 */
public class LeetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode slow = dummyHead;
        ListNode fast = dummyHead;

        n++;
        while (n-- > 0) {//快指针先走 n + 1, 因为 0 <= n <= 链表长度，所以fast不会出现空指针异常
            fast = fast.next;
        }

        while (fast != null) {//快指针移动到空指针的位置
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;//删除对应节点

        return dummyHead.next;
    }
}
