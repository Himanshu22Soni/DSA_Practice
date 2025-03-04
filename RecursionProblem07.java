public class RecursionProblem07 {
    public static boolean checkPrime(int num) {
        int index = num - 1;
        return helper(num, index);
    }

    public static boolean helper(int num, int index) {
        if (index == 1) {
            return true;
        }
        if (num % index == 0) {
            return false;
        }
        return helper(num, index - 1);
    }

    public static void main(String[] args) {
        System.out.println(checkPrime(25));
    }
}
