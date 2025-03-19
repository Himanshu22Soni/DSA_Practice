public class MathProblem01 {
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String reversed = new StringBuilder(s).reverse().toString();
        if (s.equals(reversed)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
}
