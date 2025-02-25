public class StringProblem01 {
    public static boolean checkRotatedString(String s, String goal) {
        // return s.equals(goal);
        System.out.println("Entered the loop");
        // String tempString = s;
        int i = 0;
        // int j = st.length - 1;
        char[] st = s.toCharArray();
        for (char ch : st) {
            System.out.print(ch + " ");
        }
        System.out.println();
        while (i < st.length) {
            System.out.println("Entered the while loop");
            char temp = st[0];
            // s = "abcdeabcde"
            for (int k = 1; k <= st.length - 1; k++) {
                // System.out.println(st[k-1]);
                // System.out.println(st[k]);
                st[k - 1] = st[k];
            }
            st[st.length - 1] = temp;
            i++;
            for (char ch : st) {
                System.out.print(ch + " ");
            }
            System.out.println();
            if (goal.equals(new String(st))) {
                return true;
            }

        }
        System.out.println("Exited the while loop");
        return false;
    }

    public static void main(String[] args) {
        String str = "abcde";
        // s = "abcdeabcde"
        String goalString = "adeac";
        System.out.println((str + str).contains(goalString));
        // System.out.println(checkRotatedString(str, goalString));
    }
}

// Given two strings s and goal, return true if and only if s can become goal
// after some number of shifts on s.

// A shift on s consists of moving the leftmost character of s to the rightmost
// position.

// For example, if s = "abcde", then it will be "bcdea" after one shift.

// Examples:
// Input : s = "abcde" , goal = "cdeab"

// Output : true

// Explanation : After performing 2 shifts we can achieve the goal string from
// string s.

// After first shift the string s is => bcdea

// After second shift the string s is => cdeab.

// Input : s = "abcde" , goal = "adeac"

// Output : false

// Explanation : Any number of shift operations cannot convert string s to
// string goal.