import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class leetcode21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input List 1
        int n1 = sc.nextInt();   // number of nodes in list1
        ListNode list1 = null, tail1 = null;
        for (int i = 0; i < n1; i++) {
            int x = sc.nextInt();
            ListNode node = new ListNode(x);
            if (list1 == null) {
                list1 = tail1 = node;
            } else {
                tail1.next = node;
                tail1 = node;
            }
        }

        // Input List 2
        int n2 = sc.nextInt();   // number of nodes in list2
        ListNode list2 = null, tail2 = null;
        for (int i = 0; i < n2; i++) {
            int x = sc.nextInt();
            ListNode node = new ListNode(x);
            if (list2 == null) {
                list2 = tail2 = node;
            } else {
                tail2.next = node;
                tail2 = node;
            }
        }

        leetcode21 s = new leetcode21();
        ListNode merged = s.mergeTwoLists(list1, list2);

        // Output merged list
        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
    }
}
