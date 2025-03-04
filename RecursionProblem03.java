public class RecursionProblem03 {
    public static long factorial(int n) {
        long result = 1;
        if (n == 0) {
            return 1;
        }
        result = n * factorial(n - 1);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
