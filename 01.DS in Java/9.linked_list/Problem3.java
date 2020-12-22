// search in linked list
// 10 -> 5 -> 20 -> 15
// x = 20
// output - 3

class Node {
    int data;
    Node next; // self reference

    // constructor
    Node(int x) {
        data = x;
        next = null;
    }
}

public class Problem3 {

    static int SearchLL(Node head, int x) {
        int pos = 1;
        Node curr = head;
        while (curr != null) {
            if (curr.data == x)
                return pos;
            else {
                pos += 1;
                curr = curr.next;

            }
        }
        return -1;

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

        // printing
        System.out.print(SearchLL(head, x));

    }

}
