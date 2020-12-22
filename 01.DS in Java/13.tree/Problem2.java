class Node {
    // basic tree structure
    int data;
    Node left;
    Node right;

    Node(int k) {
        data = k;
    }
}

public class Problem2 {

    // size of tree i/e number of nodesg

    static int getSize(Node root) {
        if (root == null)
            return 0;
        else
            return 1 + getSize(root.left) + getSize(root.right);
    }

    public static void main(String args[]) {

        Node root = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        Node n3 = new Node(40);
        Node n4 = new Node(50);

        root.left = n1;
        root.right = n2;
        n2.left = n3;
        n2.right = n4;

        System.out.println(getSize(root));

    }

}
