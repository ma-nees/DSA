import java.util.Arrays;

public class leetcode410 {
    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {7, 2, 5, 10, 8};
        int k1 = 2;
        System.out.println("Input: nums = " + Arrays.toString(nums1) + ", k = " + k1);
        System.out.println("Output: " + splitArray(nums1, k1)); // Expected 18

        // Example 2
        int[] nums2 = {1, 2, 3, 4, 5};
        int k2 = 2;
        System.out.println("\nInput: nums = " + Arrays.toString(nums2) + ", k = " + k2);
        System.out.println("Output: " + splitArray(nums2, k2)); // Expected 9
    }

    // ✅ Make it static so we can call directly from main
    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        // start = max element, end = sum of all elements
        for (int num : nums) {
            start = Math.max(start, num);
            end += num;
        }

        // Binary search between start and end
        while (start < end) {
            int mid = start + (end - start) / 2;

            // Greedy: try to split nums into subarrays
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > k) {
                // Too many subarrays → increase allowed sum
                start = mid + 1;
            } else {
                // Fewer or equal subarrays → try smaller sum
                end = mid;
            }
        }

        return start; // start == end here
    }
}
