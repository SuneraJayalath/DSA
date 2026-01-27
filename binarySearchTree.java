class BSTNode {
    int data;
    BSTNode left, right;

    BSTNode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinarySearchTree {
    BSTNode root;

    BSTNode insert(BSTNode node, int key) {
        if (node == null)
            return new BSTNode(key);

        if (key < node.data)
            node.left = insert(node.left, key);
        else if (key > node.data)
            node.right = insert(node.right, key);

        return node;
    }

    void inorder(BSTNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    boolean search(BSTNode node, int key) {
        if (node == null)
            return false;
        if (node.data == key)
            return true;

        return key < node.data
                ? search(node.left, key)
                : search(node.right, key);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int v : values)
            bst.root = bst.insert(bst.root, v);

        System.out.print("Inorder: ");
        bst.inorder(bst.root);

        System.out.println("\nSearch 40: " + bst.search(bst.root, 40));
    }
}
