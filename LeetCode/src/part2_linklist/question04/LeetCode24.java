package part2_linklist.question04;

import part2_linklist.pojo.ListNode;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-08-24-21:02
 */
public class LeetCode24 {
    public ListNode swapPairs(ListNode head) {

        ListNode dummyNode = new ListNode();
        dummyNode.next = head;

        ListNode currentNode = dummyNode;

        //奇数情况时cur.next.next == null
        //偶数情况，以及空链表时cur.next, cur.next.next == null
        //总结cur的下一个元素，以及cur的下下个元素都不能为空时，cur才能交换两个元素
        while (currentNode.next != null && currentNode.next.next != null) {
            /*ListNode tempNode1 = currentNode.next;//存储第一个节点
            currentNode.next = currentNode.next.next;//虚拟节点指向第二个节点
            ListNode tempNode2 = currentNode.next.next;//保存第二个节点的指向
            currentNode.next.next = tempNode1;//第二个节点指向第一个节点
            tempNode1.next = tempNode2;//第一个节点指向原来第二个节点的指向*/

            ListNode tempNode1 = currentNode.next;
            currentNode.next = currentNode.next.next;
            tempNode1.next = currentNode.next.next;
            currentNode.next.next = tempNode1;

            currentNode = currentNode.next.next;//cur移动到下一组需要交换的节点前
        }

        return dummyNode.next;//返回头结点
    }
}
