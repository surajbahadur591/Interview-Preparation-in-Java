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

    // insert in BST

    static Node insert(Node root, int x) {
        Node temp = new Node(x);
        Node parent = null, curr = root;
        while (curr != null) {
            parent = curr;
            if (curr.data > x)
                curr = curr.left;
            else if (curr.data < x) {
                curr = curr.right;
            } else
                return root;
        }
        if (parent == null)
            return temp;
        if (parent.data > x)
            parent.left = temp;
        else
            parent.right = temp;

        return root;

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

        int x = 150;

        System.out.println(insert(root, x));

    }

}
