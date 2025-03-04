public class RecursionProblem04 {
    public static int arraySum(int[] nums) {
        return helper(nums, 0);
    }

    private static int helper(int[] nums, int index) {
        if (index == nums.length) {
            return 0;
        }
        return nums[index] + helper(nums, index + 1);
    }

    public static void main(String[] args) {
        int[] input = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 3, 4, 5 };
        System.out.println(arraySum(input));
    }
}
