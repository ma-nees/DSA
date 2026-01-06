import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class leetcode206 {

    public ListNode reverseList(ListNode head) {   // core not changed
        ListNode prev = null, curr = head, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();         // number of nodes
        ListNode head = null, tail = null;

        for (int i = 0; i < n; i++) { // create list
            int x = sc.nextInt();
            ListNode node = new ListNode(x);
            if (head == null) head = tail = node;
            else { tail.next = node; tail = node; }
        }

        leetcode206 s = new leetcode206();
        head = s.reverseList(head);   // reverse

        while (head != null) {       // output
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}




