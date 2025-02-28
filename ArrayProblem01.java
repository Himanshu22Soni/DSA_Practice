import java.util.TreeSet;

public class ArrayProblem01 {
    public static int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        if (set.size() < 3) {
            return set.last();
        }
        set.pollLast();
        set.pollLast();
        return set.last();

    }

    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 6, 22, 2, 4, 3, 5, 6, 7, 8, 1 };
        System.out.println(thirdMax(nums));
    }
}
