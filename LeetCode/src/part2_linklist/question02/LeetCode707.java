package part2_linklist.question02;

import org.junit.Test;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-08-23-21:10
 */
public class LeetCode707 {
    @Test
    public void testGet(){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(1);
//        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(2,3);
        myLinkedList.deleteAtIndex(0);
        int i = myLinkedList.get(1);
        System.out.println(i);
    }

    @Test
    public void test(){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(7);
        myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(1);
        myLinkedList.addAtIndex(3, 0);
        myLinkedList.deleteAtIndex(2);
        myLinkedList.addAtHead(6);
        myLinkedList.addAtTail(4);
        System.out.println(myLinkedList.get(4));
    }

}

class MyLinkedList{

    public MyLinkedList next;
    public int val;
    public int size;
    public static MyLinkedList head = new MyLinkedList(0);//虚拟头结点


    public MyLinkedList() {

    }

    public MyLinkedList(int val) {
        this.val = val;
    }

    public int get(int index) {
        if(index > size - 1){
            return -1;
        }
        MyLinkedList currentHead = head;

        for (int i = 0; i <= index; i++) {
            currentHead = currentHead.next;
        }
        return currentHead.val;
    }

    public void addAtHead(int val) {
//        MyLinkedList myLinkedList = new MyLinkedList(val);
//        myLinkedList.next = head.next;
//        head.next = myLinkedList;
//        size++;
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
//        MyLinkedList currentNode = head;
//
//        while (currentNode.next != null){
//            currentNode = currentNode.next;
//        }
//
//        MyLinkedList newNode = new MyLinkedList(val);
//        currentNode.next = newNode;
//        size++;
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {


        if(index > size ) {
            return;
        }

        size++;
        MyLinkedList currentNode = head;//index = 0时的情况


        for (int i = 0; i < index; i++) {//index 为 1及1以后的情况
            currentNode = currentNode.next;
        }

        MyLinkedList newNode = new MyLinkedList(val);
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    public void deleteAtIndex(int index) {
        if(!(index >= 0 && index < size)) {
            return;
        }
        size--;
        if(index == 0){
            head = head.next;
            return;
        }
        MyLinkedList currentNode = head;//这是删除头结点的情况
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
    }
}
