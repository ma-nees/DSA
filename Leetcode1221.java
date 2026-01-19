public class Leetcode1221 {

    public static void main(String[] args) {

        String s = "RLRRLLRLRL";

        Solution sol = new Solution();
        int result = sol.balancedStringSplit(s);

        System.out.println(result); // Output: 4
    }
}

class Solution {
    public int balancedStringSplit(String s) {
        int left = 0;
        int right = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'L') {
                left++;
            } else {
                right++;
            }

            if (left == right) {
                count++;
            }
        }
        return count;
    }
}
