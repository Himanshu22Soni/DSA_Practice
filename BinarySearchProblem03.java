public class BinarySearchProblem03 {
    public static boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        int low = 1;
        int high = num;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(4));
    }
}
