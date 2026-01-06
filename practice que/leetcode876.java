import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class leetcode876 {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;        // 1 step
            fast = fast.next.next;   // 2 steps
        }

        return slow; // slow is now at middle
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();     // number of nodes
        ListNode head = null, tail = null;

        // Create the Linked List
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            ListNode node = new ListNode(x);
            if (head == null) head = tail = node;
            else { tail.next = node; tail = node; }
        }

        leetcode876 s = new leetcode876();
        ListNode mid = s.middleNode(head);   // find middle

        // Print from middle till end (as expected in output)
        while (mid != null) {
            System.out.print(mid.val + " ");
            mid = mid.next;
        }
    }
}
