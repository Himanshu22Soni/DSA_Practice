import java.util.ArrayList;
import java.util.List;

public class ArrayProblem08 {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0)
                k += num[i--]; // Add last digit of num to k
            list.add(0, k % 10); // Store last digit of new sum
            k /= 10; // Remove last digit from k
        }

        return list;

    }

    public static void main(String[] args) {
        int[] input = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
        int sum = 1;
        System.out.println(addToArrayForm(input, sum).toString());
    }
}
