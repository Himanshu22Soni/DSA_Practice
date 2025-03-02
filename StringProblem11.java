public class StringProblem11 {
    public static int lengthOfLongestSubstring(String s) {
        String sub = "";
        for (int i = 0; i < s.length(); i++) {
            int j = i + 1;
            String temp = s.substring(i, j);
            while (j < s.length() && s.charAt(i) != s.charAt(j) && temp.indexOf(s.charAt(j)) == -1) {
                temp = s.substring(i, j + 1);
                j++;
            }
            if (temp.length() > sub.length()) {
                sub = temp;
            }
        }
        return sub.length();
    }

    public static void main(String[] args) {
        String input = "bbbb";
        System.out.println(lengthOfLongestSubstring(input));
    }
}
