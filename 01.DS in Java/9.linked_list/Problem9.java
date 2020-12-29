class Node {
    int data;
    Node next; // self reference

    // constructor
    Node(int x) {
        data = x;
        next = null;
    }
}
// find the middle of single linked list
// slow fast pointer
// if even elements print 2nd middle

public class Problem9 {
    static void printRecursive(Node head) {
        if (head == null) {
            System.out.print("null");
            return;

        }

        System.out.print(head.data + "->");
        printRecursive(head.next);

    }
    // find middle position function

    static int findMid(Node head) {
        if (head == null)
            return -1;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;

    }

    public static void main(String args[]) {

        // creating
        Node head = new Node(10);
        Node ele1 = new Node(5);
        Node ele2 = new Node(20);
        Node ele3 = new Node(15);

        head.next = ele1;
        ele1.next = ele2;
        ele2.next = ele3;
        printRecursive(head);
        System.out.println();
        System.out.print(findMid(head));

    }

    
}
