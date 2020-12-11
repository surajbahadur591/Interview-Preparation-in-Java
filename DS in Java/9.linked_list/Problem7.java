class Node {
    int data;
    Node next; // self reference

    // constructor
    Node(int x) {
        data = x;
        next = null;
    }
}
// delete end node of single linked list

public class Problem7 {
    static void printRecursive(Node head) {
        if (head == null) {
            System.out.print("null");
            return;

        }

        System.out.print(head.data + "->");
        printRecursive(head.next);

    }
    // delete function

    static Node deleteEnd(Node head) {

        if (head == null)
            return null;
        if (head.next == null)
            return null;

        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        return head;

    }

    public static void main(String args[]) {

        // creating
        Node head = new Node(10);
        Node ele1 = new Node(5);
        Node ele2 = new Node(20);
        Node ele3 = new Node(15);

        // int x = 24;

        head.next = ele1;
        ele1.next = ele2;
        ele2.next = ele3;
        printRecursive(head);
        System.out.println();
        head = deleteEnd(head);
        printRecursive(head);

        // printing
        // System.out.print(insertBegin(head, x));
        // printRecursive(head);

    }

}
