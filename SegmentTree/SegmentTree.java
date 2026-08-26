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

    public void display() {
        
    }
}
