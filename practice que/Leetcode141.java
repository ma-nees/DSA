import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Leetcode141 {

    // Floyd’s Cycle Detection
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of nodes
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Linked List is empty. No cycle.");
            return;
        }

        // Create linked list
        System.out.print("Enter value for node 1: ");
        ListNode head = new ListNode(sc.nextInt());
        ListNode temp = head;

        ListNode cycleNode = null;

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter value for node " + i + ": ");
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }

        // Cycle position
        System.out.print("Enter position to create cycle (0 for no cycle): ");
        int pos = sc.nextInt();

        if (pos > 0) {
            ListNode ptr = head;
            for (int i = 1; i < pos; i++) {
                ptr = ptr.next;
            }
            temp.next = ptr; // create cycle
        }

        // Check cycle
        if (hasCycle(head)) {
            System.out.println("✅ Cycle detected in Linked List");
        } else {
            System.out.println("❌ No cycle in Linked List");
        }

        sc.close();
    }
}
