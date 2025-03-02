import java.util.ArrayList;

public class ArrayProblem05 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> output = new ArrayList<>();
        int[] result = new int[1001];
        for (int i : nums1) {
            result[i]++;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        for (int j = 0; j < nums2.length; j++) {
            if (result[nums2[j]] > 0) {
                output.add(nums2[j]);
                result[nums2[j]]--;
            }
        }
        return output.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] inputArr1 = { 4, 9, 5 };
        int[] inputArr2 = { 9, 4, 9, 8, 4 };
        int[] result = intersection(inputArr1, inputArr2);
        System.out.print("[ ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.print("]");
    }
}
