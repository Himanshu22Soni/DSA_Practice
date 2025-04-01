import java.util.Arrays;

public class ArrayProblem13 {
    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[][] result = new int[length][2];
        for (int i = 0; i < length; i++) {
            result[i][0] = nums[i];
            result[i][1] = i;
        }
        Arrays.sort(result, (a, b) -> Integer.compare(a[0], b[0]));
        int left = 0;
        int right = length - 1;
        while (left < right) {
            int sum = result[left][0] + result[right][0];
            if (sum == target) {
                return new int[] { result[left][1], result[right][1] };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[] { -1, -1 };

    }

    public static void main(String[] args) {
        int[] input = { 1, 3, 5, -7, 6, -3 };
        int[] output = twoSum(input, 3);
        System.out.print("[ ");
        for (int i : output) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }
}
