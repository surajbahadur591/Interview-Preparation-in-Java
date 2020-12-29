class Node {
    int data;
    Node next; // self reference

    // constructor
    Node(int x) {
        data = x;
        next = null;
    }
}
// insert at the end of single linked list

public class Problem5 {
    static void printRecursive(Node head) {
        if (head == null) {
            System.out.print("null");
            return;

        }

        System.out.print(head.data + "->");
        printRecursive(head.next);

    }
    // insert function

    static Node insertEnd(Node head, int x) {
        Node temp = new Node(x);
        if (head == null)
            return temp;

        printRecursive(head);
        System.out.println();

        Node curr = head;
        while (curr.next != null)
            curr = curr.next;
        curr.next = temp;

        printRecursive(head);

        return temp;

    }

    public static void main(String args[]) {

        // creating
        Node head = new Node(10);
        Node ele1 = new Node(5);
        Node ele2 = new Node(20);
        Node ele3 = new Node(15);

        int x = 24;

        head.next = ele1;
        ele1.next = ele2;
        ele2.next = ele3;

        insertEnd(head, x);

        // printing
        // System.out.print(insertBegin(head, x));
        // printRecursive(head);

    }
    

}
