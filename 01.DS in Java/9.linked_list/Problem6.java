class Node {
    int data;
    Node next; // self reference

    // constructor
    Node(int x) {
        data = x;
        next = null;
    }
}
// delete head node of single linked list

public class Problem6 {
    static void printRecursive(Node head) {
        if (head == null) {
            System.out.print("null");
            return;

        }

        System.out.print(head.data + "->");
        printRecursive(head.next);

    }
    // delete function

    static Node deleteStart(Node head) {

        if (head == null)
            return null;
        else
            return head.next;

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
        head = deleteStart(head);
        printRecursive(head);

        // printing
        // System.out.print(insertBegin(head, x));
        // printRecursive(head);
        

    }

}
