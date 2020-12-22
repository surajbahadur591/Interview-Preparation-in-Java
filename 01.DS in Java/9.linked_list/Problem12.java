class Node {
    int data;
    Node next; // self reference

    // constructor
    Node(int x) {
        data = x;
        next = null;
    }
}

public class Problem12 {

    static void printRecursive(Node head) {
        if (head == null) {
            System.out.print("null");
            return;

        }

        System.out.print(head.data + "->");
        printRecursive(head.next);

    }

    public static Node mergeLL(Node head1, Node head2) {
        Node t1 = head1, t2 = head2;
        Node head = null, tail = null;

        if (t1.data <= t2.data) {
            head = t1;
            tail = t1;
            t1 = t1.next;
        } else {
            head = t2;
            tail = t2;
            t2 = t2.next;
        }

        while (t1 != null && t2 != null) {
            if (t1.data <= t2.data) {
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            } else {
                tail.next = t2;
                tail = t2;
                t2 = t2.next;
            }

        }

        if (t1 != null) {
            tail.next = t1;
        } else {
            tail.next = t2;
        }

        return head;
    }

    public static void main(String args[]) {

        // creating
        Node head = new Node(1);
        Node ele1 = new Node(3);
        Node ele2 = new Node(5);

        head.next = ele1;
        ele1.next = ele2;

        Node head2 = new Node(2);
        Node ele12 = new Node(4);
        Node ele22 = new Node(6);
        Node ele32 = new Node(8);

        head2.next = ele12;
        ele12.next = ele22;
        ele22.next = ele32;

        printRecursive(head);
        System.out.println();
        printRecursive(head2);
        System.out.println();
        printRecursive(mergeLL(head, head2));

    }

}
