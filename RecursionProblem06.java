public class RecursionProblem06 {
    public static boolean palindromeCheck(String s) {
        int index = 0;
        StringBuilder sb = new StringBuilder(s);
        return helper(sb, index);
    }

    public static boolean helper(StringBuilder s, int index) {
        if (index == s.length()) {
            return true;
        }
        if (s.charAt(index) != s.charAt(s.length() - 1 - index)) {
            return false;
        }
        return helper(s, index + 1);
    }

    public static void main(String[] args) {
        String input = "nitin";
        System.out.println(palindromeCheck(input));
    }
}
