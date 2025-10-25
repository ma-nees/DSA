public class LeetCode389 {

    public static char findTheDifference(String s, String t) {
        char result = 0;

        for (char c : s.toCharArray()) {
            result ^= c;
        }

        for (char c : t.toCharArray()) {
            result ^= c;
        }

        return result;
    }

    public static void main(String[] args) {
        // Test case 1
        String s1 = "abcd";
        String t1 = "abcde";
        System.out.println("Extra character: " + findTheDifference(s1, t1)); // Expected: e

        // Test case 2
        String s2 = "";
        String t2 = "y";
        System.out.println("Extra character: " + findTheDifference(s2, t2)); // Expected: y

        // Test case 3
        String s3 = "a";
        String t3 = "aa";
        System.out.println("Extra character: " + findTheDifference(s3, t3)); // Expected: a

        // Test case 4
        String s4 = "ae";
        String t4 = "aea";
        System.out.println("Extra character: " + findTheDifference(s4, t4)); // Expected: a
    }
}
