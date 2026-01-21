public class Leetcode160 {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Your method (UNCHANGED LOGIC)
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // Step 1: Mark all nodes in list A by negating values
        ListNode curr = headA;
        while (curr != null) {
            curr.val *= -1;
            curr = curr.next;
        }

        // Step 2: Traverse list B and find first negative value
        ListNode intersection = null;
        curr = headB;
        while (curr != null) {
            if (curr.val < 0) {
                intersection = curr;
                break;
            }
            curr = curr.next;
        }

        // Step 3: Restore original values of list A
        curr = headA;
        while (curr != null) {
            curr.val *= -1;
            curr = curr.next;
        }

        return intersection;
    }

    // MAIN METHOD
    public static void main(String[] args) {

        // Common intersection part: 8 → 4 → 5
        ListNode c1 = new ListNode(8);
        c1.next = new ListNode(4);
        c1.next.next = new ListNode(5);

        // List A: 4 → 1 → 8 → 4 → 5
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = c1;

        // List B: 5 → 6 → 1 → 8 → 4 → 5
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = c1;

        // Call method
        ListNode result = getIntersectionNode(headA, headB);

        // Output
        if (result != null) {
            System.out.println("Intersected at node value: " + result.val);
        } else {
            System.out.println("No intersection");
        }
    }
}
