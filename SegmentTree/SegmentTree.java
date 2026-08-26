package JavaByKK.SegmentTree;

public class SegmentTree {

    Node root;

    static void main(String[] args) {
        int[] ar = {3, 8, 6, 7, -2, -8, 4, 9};

        SegmentTree tree = new SegmentTree(ar);
    }

    private static class Node {
        int startInterval;
        int endInterval;
        int data;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    public SegmentTree(int[] ar) {
        this.root = constructTree(ar, 0, ar.length - 1);
    }

    private Node constructTree(int[] ar, int start, int end) {
        //Base Case : Node = Leaf Node
        if(start == end) {
            Node leaf = new Node(start, end);
            leaf.data = ar[start];
            return leaf;
        }

        Node node = new Node(start, end);

        int mid = (start + end) / 2;

        node.left = constructTree(ar, start, mid);
        node.right = constructTree(ar, mid + 1, end);

        node.data = node.left.data + node.right.data;
        return node;
    }

    public int query(int qsi, int qei) {
        return query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei) {
        if(node.startInterval >= qsi && node.endInterval <= qei) {
            return node.data;
        } else if(node.startInterval > qei || node.endInterval < qsi) {
            return 0;
        }
        return query(node.left, qsi, qei) + query(node.right, qsi, qei);
    }

    public void display() {
        display(this.root);
    }

    private void display(Node node) {
        String str = "";

        //Left Node
        if(node.left != null) {
            str = "Interval: [" + node.left.startInterval + "-" + node.left.endInterval + "]" + "Data: " + node.left.data + "=>";
        } else {
            str = "No left Node";
        }

        //Current Node
        str = "Interval: [" + node.startInterval + "-" + node.endInterval + "]" + "Data: " + node.data + "<=";

        //Right Node
        if(node.right != null) {
            str = "Interval: [" + node.right.startInterval + "-" + node.right.endInterval + "]" + "Data: " + node.right.data;
        } else {
            str = "No right Node";
        }

        if(node.left != null) {
            display(node.left);
        }
        if(node.right != null) {
            display(node.right);
        }
    }
}
