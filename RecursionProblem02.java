public class RecursionProblem02 {
    public static boolean isPowerOfThree(int n) {
        boolean result = false;
        int multplier = 1;
        while (multplier < n) {
            multplier *= 3;
        }
        if (multplier == n) {
            result = true;
        }
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n < 0) {
            return false;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(0));
    }
}
