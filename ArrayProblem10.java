public class ArrayProblem10 {
    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && i < arr.length - 1) {
                for (int j = arr.length - 1; j > i + 1; j--) {
                    arr[j] = arr[j - 1];
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && i < arr.length - 1) {
                arr[i + 1] = 0;
                i++;
            }
        }

        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 3 };
        duplicateZeros(input);
    }
}
