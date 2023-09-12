package part6_StackAndQueue.question02;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-09-11-22:26
 */
public class LeetCode225 {
}

class MyStack {

    private Deque<Integer> queue = new LinkedList<>();

    public MyStack() {

    }

    public void push(int x) {
        queue.offer(x);
    }

    public int pop() {
        int size = queue.size();
        size--;
        while (size > 0) {
            queue.offer(queue.poll());
            size--;
        }
        return queue.poll();
    }

    public int top() {
        return queue.getLast();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
