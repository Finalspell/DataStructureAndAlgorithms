package part5_double_finger_needle.question07;

import org.junit.Test;
import part2_linklist.pojo.ListNode;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-09-08-20:20
 */
public class LeetCode0207 {

    @Test
    public void test() {
        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        listNode2.next = listNode1;

        ListNode intersectionNode = getIntersectionNode(listNode1, null);
        System.out.println(intersectionNode);
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode nodeA = headA;
        ListNode nodeB = headB;

        while (nodeA != null && nodeB != null) {
            if(nodeA == nodeB) return nodeA;

            nodeA = nodeA.next;
            nodeB = nodeB.next;

            if(nodeA == null && nodeB != null) {
                nodeA = headB;
            }
            if(nodeB == null && nodeA != null) {
                nodeB = headA;
            }
        }
        return null;
    }
}
