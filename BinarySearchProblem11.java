public class BinarySearchProblem11 {
    public static int[] getFloorAndCeil(int[] nums, int x) {
        int low = 0;
        int high = nums.length - 1;
        int floor = -1;
        int ceil = -1;

        // Get floor value
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= x) {
                floor = nums[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        low = 0;
        high = nums.length - 1;
        // Get ceil value
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= x) {
                ceil = nums[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return floor == -1 && ceil == -1 ? new int[] { -1 } : new int[] { floor, ceil };

    }

    public static void main(String[] args) {
        int[] input = { 3, 4, 4, 7, 8, 10 };
        int[] output = getFloorAndCeil(input, 5);
        for (int i : output) {
            System.out.print(i + " ");
        }
    }
}
