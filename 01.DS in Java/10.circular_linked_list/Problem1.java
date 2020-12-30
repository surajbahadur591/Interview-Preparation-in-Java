class Node {
    int data;
    Node next; // self reference

    // constructor
    Node(int x) {
        data = x;
        next = null;
    }
}

public class Problem1 {

    static void printList(Node head) {

        if (head == null)
            return;
        System.out.print(head.data + "->");

        for (Node r = head.next; r != head; r = r.next) {
            System.out.print(r.data + "->");
        }
    }

    // circular linked list traversal
    public static void main(String args[]) {

        // creating
        Node head = new Node(10);
        Node ele1 = new Node(5);
        Node ele2 = new Node(20);
        Node ele3 = new Node(15);

        head.next = ele1;
        ele1.next = ele2;
        ele2.next = ele3;
        ele3.next = head;

        printList(head);

        System.out.println();

    }
    

}
