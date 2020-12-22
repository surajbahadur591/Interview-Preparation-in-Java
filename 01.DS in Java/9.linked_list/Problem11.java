class Node {
    int data;
    Node next; // self reference

    // constructor
    Node(int x) {
        data = x;
        next = null;
    }
}
// detech loop in a linked list

public class Problem11 {

    static void detectLoop(Node head) {

    }

    public static void main(String args[]) {

        // creating
        Node head = new Node(10);
        Node ele1 = new Node(15);
        Node ele2 = new Node(20);
        Node ele3 = new Node(25);

        head.next = ele1;
        ele1.next = ele2;
        ele2.next = ele3;
        ele3.next = ele1;

    }

}
