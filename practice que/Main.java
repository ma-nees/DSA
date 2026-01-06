import java.util.Scanner;

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    // Constructors
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class leetcode19 {
    /**
     * Removes the nth node from the end of the list and returns its head.
     * Uses the Two-Pointer technique.
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node to handle the case where the head itself needs to be removed.
        ListNode dummy = new ListNode(0);
        ListNode fast = dummy;
        ListNode slow = dummy;
        dummy.next = head;

        // 1. Move 'fast' pointer n steps ahead to create the gap.
        // The loop runs n times, placing fast at the n-th node after dummy.
        // e.g., if n=1, fast is at head. If n=2, fast is at head.next.
        for (int i = 0; i < n; i++) {
            // Safety check: if the list is shorter than n, it's an error in a real scenario,
            // but for this problem, we assume n is valid.
            if (fast == null) return head; // Should not happen if n is valid
            fast = fast.next;
        }

        // 2. Move 'fast' and 'slow' simultaneously until 'fast' reaches the end.
        // When fast.next is null, 'slow' will be pointing to the node *before* the one to be removed.
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // 3. Skip the nth node from the end.
        // slow.next is the node to be removed.
        slow.next = slow.next.next;

        // The new head is dummy.next.
        return dummy.next;
    }
}

// Class containing the main method for testing
public class Main {
    // Helper function to print the list (optional, but good for debugging)
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + (current.next != null ? " -> " : ""));
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Input Section ---
        System.out.println("Enter the number of nodes (N):");
        int N = sc.nextInt();

        System.out.println("Enter the node values (space-separated):");
        ListNode head = null, tail = null;
        for (int i = 0; i < N; i++) { // create list
            int x = sc.nextInt();
            ListNode node = new ListNode(x);
            if (head == null) head = tail = node;
            else { 
                tail.next = node; 
                tail = node; 
            }
        }
        
        System.out.println("Enter n (the position from the end to remove):");
        int n = sc.nextInt();
        sc.close(); // Close scanner

        // --- Execution Section ---
        System.out.print("Original List: ");
        printList(head);

        leetcode19 s = new leetcode19();
        // Call the correct function: removeNthFromEnd
        head = s.removeNthFromEnd(head, n);

        // --- Output Section ---
        System.out.print("List after removing " + n + "th node from end: ");
        printList(head);
    }
}