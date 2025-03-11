public class StackProblem04LeetcodeSolution {
    public static String removeDuplicates(String s) {
        char[] chars = s.toCharArray();
        int index = -1;
        for (char c : chars) {
            if (index >= 0 && chars[index] == c)
                index--;
            else
                chars[++index] = c;
        }
        return new String(chars, 0, index + 1);
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
}
