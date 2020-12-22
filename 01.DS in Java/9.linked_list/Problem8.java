class Node {
    int data;
    Node next; // self reference

    // constructor
    Node(int x) {
        data = x;
        next = null;
    }
}
// insert at a given position of single linked list

public class Problem8 {
    static void printRecursive(Node head) {
        if (head == null) {
            System.out.print("null");
            return;

        }

        System.out.print(head.data + "->");
        printRecursive(head.next);

    }
    // insert at a position function

    static Node insertAtPos(Node head, int pos, int data) {

        Node temp = new Node(data);
        if (pos == 1) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for (int i = 0; i < pos - 2 && curr != null; i++)
            curr = curr.next;
        if (curr == null)
            return head;
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    public static void main(String args[]) {

        // creating
        Node head = new Node(10);
        Node ele1 = new Node(5);
        Node ele2 = new Node(20);
        Node ele3 = new Node(15);

        int pos = 2;
        int data = 863;

        head.next = ele1;
        ele1.next = ele2;
        ele2.next = ele3;
        printRecursive(head);
        System.out.println();
        head = insertAtPos(head, pos, data);
        printRecursive(head);

        // printing
        // System.out.print(insertBegin(head, x));
        // printRecursive(head);

    }

}
