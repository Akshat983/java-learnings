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

    
}
