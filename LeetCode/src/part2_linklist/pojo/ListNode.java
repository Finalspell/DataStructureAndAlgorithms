package part2_linklist.pojo;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-08-23-20:06
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
