public class StringProblem13 {
    public static String convert(String s, int numRows) {
        // if (numRows == 1 || s.length() <= numRows) {
        // return s; // No zigzag needed
        // }

        // StringBuilder[] rows = new StringBuilder[numRows];
        // for (int i = 0; i < numRows; i++) {
        // rows[i] = new StringBuilder(); // Initialize rows
        // }

        // int row = 0; // Start at the first row
        // boolean down = true; // Direction flag

        // for (char c : s.toCharArray()) {
        // rows[row].append(c); // Add character to the current row

        // // Change direction at the top or bottom row
        // if (row == 0) {
        // down = true;
        // } else if (row == numRows - 1) {
        // down = false;
        // }

        // // Move up or down
        // row += down ? 1 : -1;
        // }

        // // Combine all rows into a single result string
        // StringBuilder result = new StringBuilder();
        // for (StringBuilder sb : rows) {
        // result.append(sb);
        // }

        // return result.toString();

        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        boolean down = true;
        int row = 0;
        for (char c : s.toCharArray()) {
            rows[row].append(c);
            if (row == 0) {
                down = true;
            } else if (row == numRows - 1) {
                down = false;
            }

            row += down ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : rows) {
            result.append(sb);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(input, numRows));
        //Output PAHNAPLSIIGYIR
    }
}
