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
        if(node == null) return -1;
        return node.height;
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

    public void display() {
        display(this.root, "The root is: ");
    }

    private void display(Node node, String details) {
        if(node == null) return;

        System.out.println(details + node.val);

        display(node.left, "The Left node of " + node.val + " is: ");
        display(node.right, "The Right node of " + node.val + " is: ");
    }

    public void populate(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            insert(ar[i]);
        }
    }

    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length);
    }

    private void populateSorted(int[] nums, int st, int end) {
        if(st >= end) return;

        int mid = (st + end) / 2;

        this.insert(nums[mid]);
        populateSorted(nums, st, mid);
        populateSorted(nums, mid+1, end);
    }
}
