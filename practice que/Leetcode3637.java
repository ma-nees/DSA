import java.util.*;

public class Leetcode3637{ 

    public static boolean isTrionic(int[] nums) {
        int n = nums.length;
        int i = 0;

        // 1️⃣ strictly increasing
        while (i + 1 < n && nums[i] < nums[i + 1]) i++;
        if (i == 0) return false;   // no increasing part

        // 2️⃣ strictly decreasing
        while (i + 1 < n && nums[i] > nums[i + 1]) i++;
        if (i == n - 1) return false; // no last increasing part

        // 3️⃣ strictly increasing again
        while (i + 1 < n && nums[i] < nums[i + 1]) i++;

        return i == n - 1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 4, 2, 6};
        int[] nums2 = {2, 1, 3};

        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output: " + isTrionic(nums1));

        System.out.println();

        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Output: " + isTrionic(nums2));
    }
}
