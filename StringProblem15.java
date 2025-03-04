import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StringProblem15 {
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        HashMap<Integer, String> letters = new HashMap<>();
        letters.put(2, "abc");
        letters.put(3, "def");
        letters.put(4, "ghi");
        letters.put(5, "jkl");
        letters.put(6, "mno");
        letters.put(7, "pqrs");
        letters.put(8, "tuv");
        letters.put(9, "wxyz");
        if (digits.length() == 0) {
            return result;
        }
        // int index = 0;
        if (digits.length() == 1) {
            String letter = letters.get(Integer.parseInt(digits));
            for (int i = 0; i < letter.length(); i++) {
                result.add(String.valueOf(letter.charAt(i)));
            }
            return result;
        }
        for (int i = 0; i < digits.length(); i++) {

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations(""));
    }
}
