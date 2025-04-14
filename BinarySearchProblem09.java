public class BinarySearchProblem09 {
    public static int lowerBound(int[] nums, int x) {
        int low = 0;
        int high = nums.length - 1;
        int upperBound = nums.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > x) {
                upperBound = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return upperBound;
    }

    public static void main(String[] args) {
        int[] input = { 3, 5, 8, 15, 19 };
        System.out.println(lowerBound(input, 3));
    }
}
