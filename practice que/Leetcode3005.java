import java.util.HashMap;
import java.util.Map;

public class Leetcode3005 {
    public static int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int maxFreq = 0;

        // Count frequencies
        for (int n : nums) {
            int count = freq.getOrDefault(n, 0) + 1;
            freq.put(n, count);
            maxFreq = Math.max(maxFreq, count);
        }

        // Sum values with max frequency
        int result = 0;
        for (int value : freq.values()) {
            if (value == maxFreq) {
                result += value;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {1, 2, 2, 3, 1, 4};
        System.out.println("Result: " + maxFrequencyElements(nums1)); // Expected: 4

        // Test case 2
        int[] nums2 = {5, 5, 5, 6, 6, 7};
        System.out.println("Result: " + maxFrequencyElements(nums2)); // Expected: 3

        // Test case 3
        int[] nums3 = {1, 1, 2, 2, 3, 3};
        System.out.println("Result: " + maxFrequencyElements(nums3)); // Expected: 2

        // Test case 4
        int[] nums4 = {10};
        System.out.println("Result: " + maxFrequencyElements(nums4)); // Expected: 1
    }
}
