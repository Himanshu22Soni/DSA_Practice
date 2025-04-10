public class BinarySearchProblem02 {
    public static int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] > arr[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return high;
    }

    public static void main(String[] args) {
        int[] input = { 0, 10, 5, 2, 1 };
        System.out.println(peakIndexInMountainArray(input));
    }
}
