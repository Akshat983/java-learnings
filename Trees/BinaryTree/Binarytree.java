package JavaByKK.Trees.BinaryTree;


import java.util.Scanner;

public class Binarytree {

    public Binarytree() {
    }

    private static class TreeNode {
        private int val;
        private TreeNode left;
        private TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }
    }


    private TreeNode root;

    public void populate(Scanner sc) {
        System.out.println("Enter the root node: ");
        int val = sc.nextInt();

        root = new TreeNode(val);

        populate(sc, root);
    }

    private void populate(Scanner sc, TreeNode root) {
        System.out.println("Do you want to enter the left node of " + root.val);
        boolean left = sc.nextBoolean();
        if(left) {
            System.out.println("Enter the value of the left node: ");
            TreeNode leftNode  = new TreeNode(sc.nextInt());
            root.left = leftNode;
            populate(sc, leftNode);
        }

        System.out.println("Do you want to enter the right node of " + root.val);
        boolean right = sc.nextBoolean();
        if(right) {
            System.out.println("Enter the value of the right node: ");
            TreeNode rightNode  = new TreeNode(sc.nextInt());
            root.left = rightNode;
            populate(sc, rightNode);
        }
    }

    public void display() {
        display(root, 0);
    }

    private void display(TreeNode node, int level) {
        if (node == null) {
            return;
        }

        display(node.right, level + 1);

        for (int i = 0; i < level-1; i++) {
            System.out.print("|        ");
        }
        System.out.println("|------>" + node.val);

        display(node.left, level + 1);
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
