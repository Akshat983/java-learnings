package JavaByKK.BinarySearchTree;

public class BST {
    private static class Node {
        private int val;
        private Node left;
        private Node right;
        private int height;

        public Node(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }
    }

    private Node root;

    public BST() {
    }

    public int height(Node node) {
        if(root == null) return -1;
        else return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        if(root == null) {
            root = new Node(value);
        }
        else {
            insert(value, root);
        }
    }

    private Node insert(int value, Node node) {
        if(node == null) {
            node = new Node(value);
            return node;
        }

        if(value < node.val) {
            node.left = insert(value, node.left);
        }

        if(value > node.val) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    public boolean balancedTree() {
        return balancedTree(root);
    }

    public boolean balancedTree(Node node) {
        if(node == null) return true;

        return (Math.abs(height(node.left) - height(node.right)) <= 1) && balancedTree(node.left) && balancedTree(node.right);
    }
}
