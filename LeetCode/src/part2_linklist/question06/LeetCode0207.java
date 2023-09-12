package part2_linklist.question06;

import part2_linklist.pojo.ListNode;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-08-27-20:05
 */
public class LeetCode0207 {
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {

        ListNode currentNodeA = headA;
        ListNode currentNodeB = headB;

        int lengthA = 0;
        int lengthB = 0;

        while (currentNodeA != null) {
            lengthA++;
            currentNodeA = currentNodeA.next;
        }

        while (currentNodeB != null) {
            lengthB++;
            currentNodeB = currentNodeB.next;
        }

        //上面两步可以使用双指针一个循环内解决
        currentNodeA = headA;
        currentNodeB = headB;

        if( lengthB > lengthA) {//让currentNodeA大于currentNodeB
            currentNodeA = headB;
            currentNodeB = headA;
            int temp = lengthA;
            lengthA = lengthB;
            lengthB = temp;
        }

        int dif = lengthA - lengthB;

        while (dif-- > 0) {
            currentNodeA = currentNodeA.next;
        }

        while (currentNodeA != null) {
            if (currentNodeA == currentNodeB) {
                return currentNodeA;
            }
            currentNodeA = currentNodeA.next;
            currentNodeB = currentNodeB.next;
        }
        return null;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode pA = headA;
        ListNode pB = headB;

        while (pA != pB) {
            pA = (pA == null) ? headB : pA.next;
            pB = (pB == null) ? headA : pB.next;
        }

        return pA;
    }
}
