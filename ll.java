public class ll {

    private Node head;
    private Node tail;
    private int size;

    public ll() {
        this.size = 0;
    }

    // ================= INSERT OPERATIONS =================

    // Insert at beginning
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    // Insert at last
    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // Insert at given index
    public void insertMid(int val, int index) {

        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }

        Node prev = get(index - 1);
        Node node = new Node(val, prev.next);
        prev.next = node;
        size++;
    }

    // ================= DELETE OPERATIONS =================

    // Delete first node
    public int deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }

        int val = head.val;
        head = head.next;
        size--;

        if (size == 0) {
            tail = null;
        }

        return val;
    }

    // Delete last node
    public int deleteLast() {

        if (size == 0) {
            System.out.println("List is empty");
            return -1;
        }

        if (size == 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.val;

        tail = secondLast;
        tail.next = null;
        size--;

        return val;
    }

    // Delete at index
    public int deleteAtIndex(int index) {

        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return -1;
        }

        if (index == 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.val;

        prev.next = prev.next.next;
        size--;

        return val;
    }

    // ================= HELPER METHODS =================

    // Get node at index
    public Node get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // ================= NODE CLASS =================

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    // ================= MAIN =================

    public static void main(String[] args) {
        ll list = new ll();

        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(9);
        list.insertLast(99);
        list.insertMid(10, 3);

        list.display();        // 9 -> 5 -> 3 -> 10 -> 99 -> END

        list.deleteFirst();
        list.display();        // 5 -> 3 -> 10 -> 99 -> END

        list.deleteLast();
        list.display();        // 5 -> 3 -> 10 -> END

        list.deleteAtIndex(1);
        list.display();        // 5 -> 10 -> END
    }
}
