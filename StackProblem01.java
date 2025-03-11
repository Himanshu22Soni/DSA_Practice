import java.util.ArrayList;

class MinStack {

    ArrayList<Integer> stack = new ArrayList<>();

    public MinStack() {

    }

    public void push(int val) {
        stack.add(val);
        System.out.println(stack);
    }

    public void pop() {
        if (stack.size() > 0) {
            stack.remove(stack.size() - 1);
        }
    }

    public int top() {
        int popped = -1;
        if (stack.size() > 0) {
            popped = stack.get(stack.size() - 1);
        }
        return popped;

    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        System.out.println(stack.size());
        for (int i = 0; i < stack.size(); i++) {
            System.out.println("Entered for loop");
            System.out.println(stack.get(i));
            if (stack.get(i) < min) {

                min = stack.get(i);
            }
        }
        return min;
    }
}

public class StackProblem01 {
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(-1);
        System.out.println(obj.top());
        // obj.pop();
        System.out.println(obj.getMin());
    }
}
