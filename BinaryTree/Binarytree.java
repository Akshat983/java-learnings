package JavaByKK.BinaryTree;

import java.util.Scanner;

public class Binarytree {

    public Binarytree() {
    }

    private static class Node {
        private int val;
        private Node left;
        private Node right;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }
    }


    private Node root;

    public void populate(Scanner sc) {
        System.out.println("Enter the root node: ");
        int val = sc.nextInt();

        root = new Node(val);

        populate(sc, root);
    }

    private void populate(Scanner sc, Node root) {
        System.out.println("Do you want to enter the left node of " + root.val);
        boolean left = sc.nextBoolean();
        if(left) {
            System.out.println("Enter the value of the left node: ");
            Node leftNode  = new Node(sc.nextInt());
            root.left = leftNode;
            populate(sc, leftNode);
        }

        System.out.println("Do you want to enter the right node of " + root.val);
        boolean right = sc.nextBoolean();
        if(right) {
            System.out.println("Enter the value of the right node: ");
            Node rightNode  = new Node(sc.nextInt());
            root.left = rightNode;
            populate(sc, rightNode);
        }
    }

    public void display() {
        display(root, 0);
    }

    private void display(Node node, int level) {
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

    private void preOrder(Node node) {
        if(node == null) {
            return;
        }

        System.out.print(node.val + " -> ");

        preOrder(node.left);
        preOrder(node.right);
    }



}
