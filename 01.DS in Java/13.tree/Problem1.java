import java.util.Stack;

class Node {
    // basic tree structure
    int data;
    Node left;
    Node right;

    Node(int k) {
        data = k;
    }
}

public class Problem1 {

    // inorder = 20, 10, 40, 30, 50
    static void inorder(Node root) {

        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    static void iterativeInorder(Node root) {

        Stack<Node> s = new Stack<Node>();
        Node curr = root;
        while (curr != null || s.isEmpty() == false) {
            while (curr != null) {
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            System.out.print(curr.data + " ");
            curr = curr.right;
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

    static void iterativePreorder(Node root) {

        if (root == null)
            return;

        Stack<Node> s = new Stack<Node>();
        s.push(root);

        while (s.isEmpty() == false) {

            Node curr = s.pop();
            System.out.print(curr.data + " ");
            if (curr.right != null)
                s.push(curr.right);
            if (curr.left != null)
                s.push(curr.left);

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
        System.out.println("iterative inorder traversal");
        iterativeInorder(root);
        System.out.println();
        System.out.println("preorder traversal");
        preorder(root);
        System.out.println();
        System.out.println("iterative preorder traversal");
        iterativePreorder(root);
        System.out.println();
        System.out.println("postorder traversal");
        postorder(root);

    }

}
