public class BinarySearchProblem08 {
    public static int shipWithinDays(int[] weights, int days) {
        int low = -1;
        int high = 0;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > low) {
                low = weights[i];
            }
        }
        for (int i = 0; i < weights.length; i++) {
            high += weights[i];
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canShip(weights, mid, days)) {
                high = mid;
            } else {
                low = mid + 1;
            }

        }

        return low;
    }

    public static boolean canShip(int[] weights, int capacity, int days) {
        int day = 1;
        int total = 0;
        for (int w : weights) {
            if (total + w > capacity) {
                day++;
                total = 0;
            }
            total += w;
        }
        return day <= days;
    }

    public static void main(String[] args) {
        int[] input = { 3, 2, 2, 4, 1, 4 };
        System.out.println(shipWithinDays(input, 3));
    }
}
