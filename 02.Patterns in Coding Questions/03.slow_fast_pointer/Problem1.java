class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Problem1 {

    // slow fast pointer
    // check if linked list has cycle or not

    public static boolean hasCycle(Node head) {

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {

            // slow moves by 1
            slow = slow.next;
            // fast moves by 2
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }

        return false;

    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = head;

        System.out.println(hasCycle(head));

    }

}
