class Node {
    int data;
    Node next; // self reference

    // constructor
    Node(int x) {
        data = x;
        next = null;
    }
}
// insert at the start of single linked list

public class Problem4 {
    static void printRecursive(Node head) {
        if (head == null) {
            System.out.print("null");
            return;

        }

        System.out.print(head.data + "->");
        printRecursive(head.next);

    }
    // insert function

    static Node insertBegin(Node head, int x) {
        Node temp = new Node(x);
        temp.next = head;
        // head.next = temp;
        printRecursive(head);
        System.out.println();
        printRecursive(temp);
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

        insertBegin(head, x);

        // printing
        // System.out.print(insertBegin(head, x));
        // printRecursive(head);

        
    }

}
