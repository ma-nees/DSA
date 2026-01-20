import java.util.*;

// Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

// Solution class (same logic as LeetCode)
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode fast = head, slow = head;

        // Find middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode prev = null;
        while (slow != null) {
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        // Compare both halves
        while (prev != null) {
            if (head.val != prev.val) return false;
            head = head.next;
            prev = prev.next;
        }

        return true;
    }
}

// Main class with LeetCode-style input
public class Leetcode234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example input: [1,2,2,1]
        System.out.print("Enter linked list like [1,2,2,1]: ");
        String input = sc.nextLine();

        // Remove brackets
        input = input.replace("[", "").replace("]", "");

        // Edge case: empty list
        if (input.trim().isEmpty()) {
            System.out.println("true");
            return;
        }

        // Convert string to linked list
        String[] values = input.split(",");
        ListNode head = new ListNode(Integer.parseInt(values[0].trim()));
        ListNode curr = head;

        for (int i = 1; i < values.length; i++) {
            curr.next = new ListNode(Integer.parseInt(values[i].trim()));
            curr = curr.next;
        }

        Solution sol = new Solution();
        System.out.println(sol.isPalindrome(head));
    }
}
