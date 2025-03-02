public class ArrayProblem06 {
    public static int minSubArrayLen(int target, int[] nums) {
        int l = 0, s = 0, m = Integer.MAX_VALUE;
        for (int r = 0; r < nums.length; r++) {
            s += nums[r]; // Expand the window by adding nums[r]
            while (s >= target) { // Shrink the window while the sum is ≥ target
                m = Math.min(m, r - l + 1); // Update the minimum length
                s -= nums[l++]; // Shrink the window from the left
            }
        }
        return (m == Integer.MAX_VALUE) ? 0 : m;
    }

    public static void main(String[] args) {
        int sumTarget = 7;
        int[] input = { 2, 3, 1, 2, 4, 3 };
        System.out.println(minSubArrayLen(sumTarget, input));
    }
}
