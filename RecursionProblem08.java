public class RecursionProblem08 {
    public static int[] reverseArray(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        return helper(nums, low, high);
    }

    private static int[] helper(int[] nums, int low, int high) {
        if (low == high) {
            return nums;
        }
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
        return helper(nums, low + 1, high - 1);
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.print("[ ");
        for (int i : reverseArray(input)) {
            System.out.print(i + " ");
        }
        System.out.print("]");

    }
}
