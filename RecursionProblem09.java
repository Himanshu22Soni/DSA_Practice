import java.util.ArrayList;

public class RecursionProblem09 {
    public static boolean isSorted(ArrayList<Integer> nums) {
        int index = 0;
        return helper(nums, index);
    }

    private static boolean helper(ArrayList<Integer> nums, int index) {
        if (index == nums.size() - 1) {
            return true;
        }
        if (nums.get(index) > nums.get(index + 1)) {
            return false;
        }
        return helper(nums, index + 1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(1);
        input.add(2);
        input.add(8);
        input.add(4);
        input.add(5);
        System.out.println(isSorted(input));
    }
}
