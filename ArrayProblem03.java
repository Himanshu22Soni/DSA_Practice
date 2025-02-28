public class ArrayProblem03 {
    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n + 1];
        for (int i = 0; i < n; i++) {
            freq[nums[i]]++;
        }
        int[] output = new int[2];
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                output[0] = i;
            }
            if (freq[i] == 0) {
                output[1] = i;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[] input = { 2, 2 };
        int[] output = findErrorNums(input);
        for (int x : output) {
            System.out.print(x + " ");
        }
    }
}
