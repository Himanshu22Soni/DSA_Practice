public class BinarySearchProblem04 {
    public static char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length - 1;
        char smallest = ' ';

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((letters[mid] - 'a') > (target - 'a')) {
                smallest = letters[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return smallest == ' ' ? letters[0] : smallest;
    }

    public static void main(String[] args) {
        char[] input = { 'x', 'x', 'y', 'y' };
        System.out.println(nextGreatestLetter(input, 'z'));
    }
}
