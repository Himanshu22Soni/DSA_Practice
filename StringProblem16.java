import java.util.Stack;

public class StringProblem16 {
    public static int calculate(String s) {
        s = s.trim();
        Stack<Integer> numStack = new Stack<>();
        int num = 0;
        char sign = '+';
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
                System.out.println("num: " + num);
            }
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || i == s.length() - 1) {
                System.out.println("sign: " + sign);
                if (sign == '+') {
                    numStack.push(num);
                } else if (sign == '-') {
                    numStack.push(-num);
                } else if (sign == '*') {
                    numStack.push(numStack.pop() * num);
                } else if (sign == '/') {
                    numStack.push(numStack.pop() / num);
                }
                sign = ch;
                System.out.println("numStack: " + numStack);
                System.out.println("sign: " + sign);
                num = 0;
            }
        }
        int result = 0;
        while (!numStack.isEmpty()) {
            result += numStack.pop();
        }
        return result;

    }

    public static void main(String[] args) {
        String input = " 8/1+3+5 / 2 -1";
        System.out.println(calculate(input));
    }
}
