public class RecursionProblem10 {
    public static int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int sum = helper(num, 0);
        return addDigits(sum);
    }

    private static int helper(int num, int sum) {
        if (num == 0) {
            return sum;
        }
        sum += num % 10;
        System.out.println("sum: " + sum);
        num = num / 10;
        System.out.println("num: " + num);
        return helper(num, sum);
    }

    public static void main(String[] args) {
        int input = 22690;
        System.out.println(addDigits(input));
    }
}
