package JavaByKK.AVLTree;


public class AVL {
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

    public AVL() {
    }

    public 

    public int height(Node node) {
        if(node == null) return -1;
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        insert(value, root);
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

        return rotate(node);
    }

    private Node rotate(Node node) {
        //LEFT HEAVY
        if(height(node.left) - height(node.right) > 1) {
            //LEFT-LEFT
            if(height(node.left.left) - height(node.left.right) > 0) {
                return rightRotate(node);
            }
            //LEFT-RIGHT
            if(height(node.left.left) - height(node.left.right) < 0) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        //RIGHT HEAVY
        if(height(node.left) - height(node.right) < -1) {
            //RIGHT-RIGHT
            if(height(node.right.right) - height(node.right.left) > 0) {
                return leftRotate(node);
            }
            //RIGHT-LEFT
            if(height(node.right.right) - height(node.right.left) < 0) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
    }

    private Node leftRotate(Node p) {
        Node c = p.right;
        Node t = c.left;

        c.left = p;
        p.right = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
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

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
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

    private void postOrder(Node node) {
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

    private void inOrder(Node node) {
        if(node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.val + " -> ");
        inOrder(node.right);
    }
}

