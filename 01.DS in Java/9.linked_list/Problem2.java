// recursive display of linked list
//output 10 -> 20 -> 30 -> null
class Node {
    int data;
    Node next; // self reference

    // constructor
    Node(int x) {
        data = x;
        next = null;
    }
}

public class Problem2 {
    static void printRecursive(Node head) {
        if (head == null) {
            System.out.print("null");
            return;

        }

        System.out.print(head.data + "->");
        printRecursive(head.next);

    }

    public static void main(String args[]) {

        // creating
        Node head = new Node(10);
        Node ele1 = new Node(20);
        Node ele2 = new Node(30);

        head.next = ele1;
        ele1.next = ele2;

        // printing
        printRecursive(head);
        

    }
}
