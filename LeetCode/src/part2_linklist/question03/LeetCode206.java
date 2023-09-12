package part2_linklist.question03;

import part2_linklist.pojo.ListNode;
import org.junit.Test;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-08-24-19:50
 */
public class LeetCode206 {

    @Test
    public void test() {
//        head = [1,2,3,4,5]
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode listNode = reverseList(node1);
        ListNode head = listNode;
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode currentNode = head;
        while (currentNode != null) {

            ListNode tempNode = currentNode.next;
            currentNode.next = pre;
            pre = currentNode;
            currentNode = tempNode;

        }
        return pre;
    }
}
