public class Leetcode53 { 

    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            // Either extend the current subarray or start new from nums[i]
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Update global maximum
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Max Subarray Sum: " + maxSubArray(nums1)); // Expected: 6

        // Test case 2
        int[] nums2 = {1};
        System.out.println("Max Subarray Sum: " + maxSubArray(nums2)); // Expected: 1

        // Test case 3
        int[] nums3 = {5,4,-1,7,8};
        System.out.println("Max Subarray Sum: " + maxSubArray(nums3)); // Expected: 23

        // Test case 4
        int[] nums4 = {-1, -2, -3, -4};
        System.out.println("Max Subarray Sum: " + maxSubArray(nums4)); // Expected: -1
    }
}
