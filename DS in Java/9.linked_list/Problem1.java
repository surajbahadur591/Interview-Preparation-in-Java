// creating  and traversing linked list in java

// output 10 -> 20 -> 30 -> null

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
    // function to print list
    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
            if (curr == null)
                System.out.print("null");

        }

    }

    public static void main(String args[]) {
        // creating
        Node head = new Node(10);
        Node ele1 = new Node(20);
        Node ele2 = new Node(30);

        head.next = ele1;
        ele1.next = ele2;

        // printing
        printList(head);

    }
}
