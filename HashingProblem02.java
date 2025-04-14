import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashingProblem02 {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapping = new HashMap<>();
        Set<Character> used = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (mapping.containsKey(sc)) {
                if (mapping.get(sc) != tc)
                    return false;
            } else {
                if (used.contains(tc))
                    return false; // already mapped
                mapping.put(sc, tc);
                used.add(tc);
            }
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
    }
}
