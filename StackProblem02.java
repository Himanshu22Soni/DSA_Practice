import java.util.Stack;
// Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).

// Implement the MyQueue class:

// void push(int x) Pushes element x to the back of the queue.
// int pop() Removes the element from the front of the queue and returns it.
// int peek() Returns the element at the front of the queue.
// boolean empty() Returns true if the queue is empty, false otherwise.

class MyQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        stack1.add(x);
    }

    public int pop() {
        if (stack1.isEmpty()) {
            return -1;
        }
        return stack1.remove(0);
    }

    public int peek() {
        if (stack1.isEmpty()) {
            return -1;

        }
        return stack1.get(0);
    }

    public boolean empty() {
        if (!stack1.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}

public class StackProblem02 {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(10);
        System.out.println(obj.pop());
        System.out.println(obj.peek());
        System.out.println(obj.empty());
    }
}
