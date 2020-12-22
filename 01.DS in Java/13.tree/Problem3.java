class Node {
    // basic tree structure
    int data;
    Node left;
    Node right;

    Node(int k) {
        data = k;
    }
}

public class Problem3 {

    // Maximun element in the tree

    static int getMax(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;
        else
            return Math.max(root.data, Math.max(getMax(root.left), getMax(root.right)));
    }

    public static void main(String args[]) {

        Node root = new Node(20);
        Node n1 = new Node(80);
        Node n2 = new Node(30);
        Node n3 = new Node(40);
        Node n4 = new Node(50);

        root.left = n1;
        root.right = n2;
        n2.left = n3;
        n2.right = n4;

        System.out.println(getMax(root));

    }

}
