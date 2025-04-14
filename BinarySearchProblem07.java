public class BinarySearchProblem07 {
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > high) {
                high = piles[i];
            }
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canEatAll(piles, mid, h)) {
                high = mid;
            } else {
                low = mid + 1;
            }

        }

        return low;
    }

    public static boolean canEatAll(int[] piles, int k, int h) {
        int totalTime = 0;
        for (int i = 0; i < piles.length; i++) {
            totalTime += (piles[i] + k - 1) / k;
        }

        return totalTime <= h;
    }

    public static void main(String[] args) {
        int[] input = { 30, 11, 23, 4, 20 };
        System.out.println(minEatingSpeed(input, 6));
    }
}
