public class StringProblem18 {
    public static String reorganizeString(String s) {
        String result = "";
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        int max = 0;
        int letter = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                letter = i;
            }
        }
        if (max > (s.length() + 1) / 2) {
            return result;
        }
        char[] res = new char[s.length()];
        int index = 0;
        while (count[letter] > 0) {
            res[index] = (char) (letter + 'a');
            index += 2;
            count[letter]--;
        }
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                if (index >= s.length()) {
                    index = 1;
                }
                res[index] = (char) (i + 'a');
                index += 2;
                count[i]--;
            }
        }
        return new String(res);

    }

    public static void main(String[] args) {
        System.out.println(reorganizeString("aab"));
        System.out.println(4 & 1);
    }
}
