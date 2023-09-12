package part2_linklist.question01;


import part2_linklist.pojo.ListNode;
import org.junit.Test;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-08-23-20:57
 */
public class LeetCode203Better {
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


        ListNode dummyNode = new ListNode();
        dummyNode.next = head;

        ListNode currentNode = dummyNode;
        while (currentNode.next != null) {
            if (currentNode.next.val == val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }

        return dummyNode.next;
    }


}
