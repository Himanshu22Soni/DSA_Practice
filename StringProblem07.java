import java.util.Arrays;

public class StringProblem07 {
    public static boolean isAnagram(String s, String t) {
        // HashMap<Character, Integer> map = new HashMap<>();
        // if (s.length() != t.length()) {
        // return false;
        // }
        // for(int i=0;i<s.length();i++){
        // map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        // }
        // for(int i=0;i<t.length();i++){
        // map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)+1);
        // }
        // sort the string
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        return Arrays.equals(s1, t1);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
