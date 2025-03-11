import java.util.ArrayDeque;
import java.util.Queue;

class MyStack {

    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public MyStack() {
        queue1 = new ArrayDeque<>();
        queue2 = new ArrayDeque<>();
    }

    public void push(int x) {
        queue2.add(x); // Push element into queue2

        // Move all elements from queue1 to queue2
        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }

        // Swap queue1 and queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop() {
        if (queue1.isEmpty())
            return -1;
        return queue1.remove();
    }

    public int top() {
        if (queue1.isEmpty())
            return -1;
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}
// Implement a last-in-first-out (LIFO) stack using only two queues. The
// implemented stack should support all the functions of a normal stack (push,
// top, pop, and empty).

// Implement the MyStack class:

// void push(int x) Pushes element x to the top of the stack.
// int pop() Removes the element on the top of the stack and returns it.
// int top() Returns the element on the top of the stack.
// boolean empty() Returns true if the stack is empty, false otherwise.
// Notes:

// You must use only standard operations of a queue, which means that only push
// to back, peek/pop from front, size and is empty operations are valid.
// Depending on your language, the queue may not be supported natively. You may
// simulate a queue using a list or deque (double-ended queue) as long as you
// use only a queue's standard operations.

public class StackProblem05 {
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(5);
        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
    }
}
