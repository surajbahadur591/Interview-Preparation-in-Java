class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Problem3 {

    // Middle of the LinkedList

    // returning node instead of position
    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        // when fast reach end, slow will be middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = null;

        // accesing the data of node
        System.out.println(findMiddle(head).data);

    }

}
