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

    // search in BST

    static boolean search(Node root, int x) {
        if (root == null)
            return false;
        else if (root.data == x)
            return true;
        else if (root.data < x)
            return search(root.right, x);
        else
            return search(root.right, x);

    }

    static boolean iterativeSearch(Node root, int x) {
        while (root != null) {
            if (root.data == x)
                return true;
            else if (root.data < x)
                root = root.right;
            else
                root = root.left;

        }
        return false;

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

        int x = 50;

        System.out.println(search(root, x));
        System.out.println(iterativeSearch(root, x));

    }

}
