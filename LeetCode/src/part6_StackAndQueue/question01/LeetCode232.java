package part6_StackAndQueue.question01;

import java.util.LinkedList;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-09-11-21:15
 */
public class LeetCode232 {

}

class MyQueue {

    private LinkedList<Integer> stack1 = new LinkedList<>();
    private LinkedList<Integer> stack2 = new LinkedList<>();

    public MyQueue() {
    }

    public void push(int x) {
        stack1.addLast(x);
    }

    public int pop() {
        if(stack2.size() != 0) {
            return stack2.removeLast();
        } else {
            while (!stack1.isEmpty()) {
                stack2.addLast(stack1.removeLast());
            }
            return stack2.removeLast();
        }
    }

    public int peek() {
        if(stack2.size() != 0) {
            return stack2.getLast();
        } else {
            while (!stack1.isEmpty()) {
                stack2.addLast(stack1.removeLast());
            }
            return stack2.getLast();
        }
    }

    public boolean empty() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}