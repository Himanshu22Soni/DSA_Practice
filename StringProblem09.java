import java.util.HashMap;

public class StringProblem09 {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int answer = -1;
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                answer = i;
                break;
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
}
