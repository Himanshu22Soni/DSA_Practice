// Given an array of integers nums and an integer k, an element nums[i] is considered good if it is strictly greater than the elements at indices i - k and i + k (if those indices exist). If neither of these indices exists, nums[i] is still considered good.

// Return the sum of all the good elements in the array.

public class ArrayProblem11 {
    public static int sumOfGoodNumbers(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i - k > 0) {
                if (i + k < nums.length) {
                    if (nums[i] > nums[i - k] && nums[i] > nums[i + k]) {
                        sum += nums[i];
                    }
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] input = { 1, 3, 2, 1, 5, 4 };
        System.out.println(sumOfGoodNumbers(input, 2));
    }
}
