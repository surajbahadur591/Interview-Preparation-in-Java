class Node {
    // basic tree structure
    int data;
    Node left;
    Node right;

    Node(int k) {
        data = k;
    }
}

public class problem1 {

    // inorder = 20, 10, 40, 30, 50
    static void inorder(Node root) {

        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // preorder = 10, 20, 30, 40, 50
    static void preorder(Node root) {

        if (root != null) {

            System.out.print(root.data + " ");
            inorder(root.left);
            inorder(root.right);
        }
    }

    // postorder = 20, 40, 50, 30, 10
    static void postorder(Node root) {

        if (root != null) {

            inorder(root.left);
            inorder(root.right);
            System.out.print(root.data + " ");
        }
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
        System.out.println("inorder traversal");
        inorder(root);
        System.out.println();
        System.out.println("preorder traversal");
        preorder(root);
        System.out.println();
        System.out.println("postorder traversal");
        postorder(root);

    }

}
