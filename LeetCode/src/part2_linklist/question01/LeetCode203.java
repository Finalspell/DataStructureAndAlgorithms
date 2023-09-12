package part2_linklist.question01;


import part2_linklist.pojo.ListNode;
import org.junit.Test;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-08-23-20:05
 */
public class LeetCode203 {
    @Test
    public void test(){
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        ListNode listNode = removeElements(listNode1, 6);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public ListNode removeElements(ListNode head, int val) {

        while (head != null && head.val == val){//如果头结点是要删除的元素，则头指针指向下一个元素
            head = head.next;
        }

        if(head == null){//如果头结点都为空，则整个链表都为空
            return null;
        }
        ListNode node = head;

        while (node.next != null){//查询头节点以后的节点
            if(node.next.val == val) {//
                node.next = node.next.next;//删除node.next
            }else{
                node = node.next;
            }
        }
        return head;
    }
}
