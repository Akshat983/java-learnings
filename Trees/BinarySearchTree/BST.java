package JavaByKK.Trees.BinarySearchTree;


public class BST {
    private static class TreeNode {
        private int val;
        private TreeNode left;
        private TreeNode right;
        private int height;

        public TreeNode(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }
    }

    private TreeNode root;

    public BST() {
    }

    public int height(TreeNode node) {
        if(node == null) return -1;
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        if(root == null) {
            root = new TreeNode(value);
        }
        else {
            insert(value, root);
        }
    }

    private TreeNode insert(int value, TreeNode node) {
        if(node == null) {
            node = new TreeNode(value);
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

    public boolean balancedTree(TreeNode node) {
        if(node == null) return true;

        return (Math.abs(height(node.left) - height(node.right)) <= 1) && balancedTree(node.left) && balancedTree(node.right);
    }

    public void display() {
        display(this.root, "The root is: ");
    }

    private void display(TreeNode node, String details) {
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

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(TreeNode node) {
        if(node == null) {
            return;
        }

        System.out.print(node.val + " -> ");

        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(TreeNode node) {
        if(node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);

        System.out.print(node.val + " -> ");

    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(TreeNode node) {
        if(node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.val + " -> ");
        inOrder(node.right);
    }
}
