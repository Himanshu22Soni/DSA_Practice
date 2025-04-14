public class BinarySearchProblem05 {
    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[] { -1, -1 };
        }

        if (nums.length == 1 && nums[0] == target) {
            return new int[] { 0, 0 };
        }

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                if (mid + 1 <= nums.length - 1 && nums[mid + 1] == target) {
                    return new int[] { mid, mid + 1 };
                } else if (mid - 1 >= 0 && nums[mid - 1] == target) {
                    return new int[] { mid - 1, mid };
                } else {
                    return new int[] { -1, mid };
                }
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] input = { 5, 7, 7, 8, 8, 10 };
        int[] output = searchRange(input, 8);
        System.out.print("[ ");
        for (int x : output) {
            System.out.print(x + " ");
        }
        System.out.print("]");
    }
}
