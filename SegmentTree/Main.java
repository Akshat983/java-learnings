package JavaByKK.SegmentTree;

public class Main {
    static void main(String[] args) {
        int[] ar = {3, 8, 6, 7, -2, -8, 4, 9};

        SegmentTree tree = new SegmentTree(ar);

        tree.display();
    }
}
