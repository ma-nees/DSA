

public class LeetCode520 { 

    public static boolean detectCapitalUse(String word) {
        int count = 0;
        int n = word.length();

        if (n == 1) return true;

        // Count uppercase letters
        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                count++;
            }
        }

        // Check valid cases
        if (count == 1 && Character.isUpperCase(word.charAt(0))) return true;
        if (count == 0 || count == n) return true;

        return false;
    }

    public static void main(String[] args) {
        // Test case 1
        String word1 = "USA";
        System.out.println(word1 + " → " + detectCapitalUse(word1)); // Expected: true

        // Test case 2
        String word2 = "leetcode";
        System.out.println(word2 + " → " + detectCapitalUse(word2)); // Expected: true

        // Test case 3
        String word3 = "Google";
        System.out.println(word3 + " → " + detectCapitalUse(word3)); // Expected: true

        // Test case 4
        String word4 = "FlaG";
        System.out.println(word4 + " → " + detectCapitalUse(word4)); // Expected: false
    }
}
