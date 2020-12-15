class Node {
    // basic tree structure
    int data;
    Node left;
    Node right;

    Node(int k) {
        data = k;
    }
}

public class Problem4 {

    // height of the tree | root to leaf node

    static int getHeight(Node root) {
        if (root == null)
            return 0;
        else
            return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

    public static void main(String args[]) {

        Node root = new Node(20);
        Node n1 = new Node(80);
        Node n2 = new Node(30);
        Node n3 = new Node(40);
        Node n4 = new Node(50);
        Node n5 = new Node(100);

        root.left = n1;
        root.right = n2;
        n2.left = n3;
        n2.right = n4;
        n3.left = n5;

        System.out.println(getHeight(root));

    }

}
