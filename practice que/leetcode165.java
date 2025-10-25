public class leetcode165 {

    public int compareVersion(String version1, String version2) {
        int i = 0, j = 0;
        int n = version1.length(), m = version2.length();

        while (i < n || j < m) {
            long num1 = 0, num2 = 0; // long to avoid overflow

            while (i < n && version1.charAt(i) != '.') {
                num1 = num1 * 10 + (version1.charAt(i) - '0');
                i++;
            }

            while (j < m && version2.charAt(j) != '.') {
                num2 = num2 * 10 + (version2.charAt(j) - '0');
                j++;
            }

            if (num1 > num2) return 1;
            if (num1 < num2) return -1;

            // skip dots
            if (i < n && version1.charAt(i) == '.') i++;
            if (j < m && version2.charAt(j) == '.') j++;
        }

        return 0;
    }

    public static void main(String[] args) {
        leetcode165 solution = new leetcode165();

        // Array of test cases
        String[][] testCases = {
            {"1.01", "1.001"},
            {"1.0", "1.0.0"},
            {"0.1", "1.1"},
            {"1.0.1", "1"},
            {"7.5.2.4", "7.5.3"},
            {"1.2", "1.10"},
            {"1.0.0.0", "1"},
            {"2.5.33", "2.5.33"}
        };

        // Run all test cases
        for (String[] test : testCases) {
            String v1 = test[0], v2 = test[1];
            int result = solution.compareVersion(v1, v2);

            System.out.println("compareVersion(\"" + v1 + "\", \"" + v2 + "\") = " + result);
        }
    }
}
