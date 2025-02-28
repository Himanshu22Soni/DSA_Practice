import java.util.ArrayList;
import java.util.List;

public class ArrayProblem02 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> output = new ArrayList<>();

        // Marking visited indices
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // Convert number to index (1-based to 0-based)
            if (nums[index] > 0) { // Only mark once
                nums[index] = -nums[index];
            }
        }

        // Finding missing numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) { // If positive, index + 1 is missing
                output.add(i + 1);
            }
        }

        return output;
    }

    public static void main(String[] args) {
        int[] input = { 1, 1, 2, 2 };
        System.out.println(findDisappearedNumbers(input));
    }
}
