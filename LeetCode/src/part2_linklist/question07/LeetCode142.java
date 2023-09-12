package part2_linklist.question07;

import part2_linklist.pojo.ListNode;

import java.util.HashSet;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-08-28-19:08
 */
public class LeetCode142 {
    public ListNode detectCycle1(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();

        ListNode currentNode = head;
        while (currentNode != null) {
            set.add(currentNode);
            if (set.contains(currentNode.next)) {
                return currentNode.next;
            }
            currentNode = currentNode.next;
        }
        return null;
    }
    public ListNode detectCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast!= null && fast.next!= null) {

            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                ListNode index1 = fast;
                ListNode index2 = head;

                while (index1 != index2) {
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index1;
            }
        }
        return null;
    }
}
