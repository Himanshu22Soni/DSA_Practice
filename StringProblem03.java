
public class StringProblem03 {
    public static void frequencySort(String s) {
        int[] freq = new int[26];

        for (int x : freq) {
            System.out.print(x + " ");
        }

        System.out.println();
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int x : freq) {
            System.out.print(x + " ");
        }

    }

    public static void main(String[] args) {
        String str = "jaalddrnfnrneoeicvnidhjndlsdnfoih";
        // System.out.println(frequencySort(str));
        frequencySort(str);
    }
}
