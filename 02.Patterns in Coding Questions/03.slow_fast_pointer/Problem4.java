class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Problem4 {

    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = reverse(slow);
        Node secondHalfCopy = secondHalf;

        while (head != null & secondHalf != null) {
            if (head.data != secondHalf.data)
                break;
            head = head.next;
            secondHalf = secondHalf.next;
        }
        reverse(secondHalfCopy);
        if (head == null || secondHalfCopy == null)
            return true;
        return false;

    }

    public static Node reverse(Node head) {
        Node prev = null;

        while (head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    public static void main(String[] args) {

        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(6);
        head.next.next = new Node(4);
        head.next.next.next = new Node(2);
        // head.next.next.next.next = null;

        // accesing the data of node
        System.out.println(isPalindrome(head));

    }

}
