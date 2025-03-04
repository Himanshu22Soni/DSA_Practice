import java.util.Vector;

public class RecursionProblem05 {
    public static Vector<Character> reverseString(Vector<Character> s) {
        Vector<Character> result = new Vector<Character>();
        int index = 0;
        return helper(s, result, index);
    }

    public static Vector<Character> helper(Vector<Character> s, Vector<Character> r, int index) {
        if (index == s.size()) {
            return r;
        }
        r.addFirst(s.get(index));
        return helper(s, r, index + 1);
    }

    public static void main(String[] args) {
        Vector<Character> input = new Vector<Character>();
        input.add('h');
        input.add('e');
        input.add('l');
        input.add('l');
        input.add('o');

        System.out.println(reverseString(input));
    }
}
